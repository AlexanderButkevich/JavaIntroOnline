package by.epam.training_center.part2.beans.task4;

/**
 * Aggregation and composition
 */
public class Account {
    private String number;
    private int balance;
    private boolean blocked;

    public Account() {
        this.blocked = false;
    }

    public Account(String number, double balance) {
        this();
        this.number = number;
        setBalance(balance);
    }

    public String getNumber() {
        return number;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean value) {
        blocked = value;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private void setBalance(double balance) {
        this.balance = (int) (balance * 100);
    }

    @Override
    public String toString() {
        return "Account number='" + number + '\'' +
                ", balance=" + balToString(balance) + (blocked ? " blocked" : "");
    }

    public static String balToString(int value) {
        return String.format("$%d.%02d", value/100, value%100);
    }
}
