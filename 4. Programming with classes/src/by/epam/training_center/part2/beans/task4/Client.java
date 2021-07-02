package by.epam.training_center.part2.beans.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Aggregation and composition
 */
public class Client {
    private String name;
    private final List<Account> accounts = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount(String number) {
        Optional<Account> accountOptional = getAccount(ac -> ac.getNumber().equals(number));
        return accountOptional.orElse(null);
    }

    public Account getAccount(double balance) {
        int bal = (int) (balance * 100);
        Optional<Account> accountOptional = getAccount(ac -> ac.getBalance() == bal);
        return accountOptional.orElse(null);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }


    public void sortAccounts(Comparator<Account> cmp) {
        accounts.sort(cmp);
    }

    public int totalBalance() {
        return sumBalance(el -> true);
    }

    public int totalPosBalance() {
        return sumBalance(el -> el > 0);
    }

    public int totalNegBalance() {
        return sumBalance(el -> el < 0);
    }

    private int sumBalance(IntPredicate predicate) {
        return accounts.stream().mapToInt(Account::getBalance).filter(predicate).sum();
    }

    private Optional<Account> getAccount(Predicate<Account> predicate) {
        return accounts
                .stream()
                .dropWhile(predicate.negate())
                .findFirst();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        accounts.forEach(ac -> sb.append(ac).append('\n'));
        return "Client '" + name + '\'' +
                ", accounts:\n" + sb.toString() +
                "\ttotal balance: " + Account.balToString(totalBalance());
    }
}
