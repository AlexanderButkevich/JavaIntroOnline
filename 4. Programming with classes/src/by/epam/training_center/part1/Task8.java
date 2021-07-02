package by.epam.training_center.part1;

import by.epam.training_center.part1.beans.task8.Customer;
import by.epam.training_center.part1.beans.task8.CustomerGroup;

import java.util.Comparator;
import java.util.function.Predicate;

/**
 * Classes and Objects
 */
public final class Task8 {
    public static void solution() {

        CustomerGroup group = new CustomerGroup(){{
            add(
                    new Customer("Linnaeus", "Carolus", "", "Sweden", 1778177817781778L, "5200032A"),
                    new Customer("Burnside", "Ambrose", "", "USA", 1881188118811881L, "5200035B"),
                    new Customer("Lagerkvist", "Par", "", "Sweden", 1974197419741974L, "5200033"),
                    new Customer("Collins", "Joan", "", "England", 1933193319331933L, "5200045C"),
                    new Customer("Carey", "Drew", "", "USA", 1958195819581958L, "5200055"),
                    new Customer("Jennings", "Ken", "", "USA", 1974197419741974L, "5200046A"),
                    new Customer("Kidd", "Captain", "", "Scotland", 1701170117011701L, "5200047C"),
                    new Customer("Ranke", "Leopold", "", "Germany", 1886188618861886L, "5200050"),
                    new Customer("Ibsen", "Henrik", "", "Norway", 1906190619061906L, "5200062A")
            );
        }};

        Comparator<Customer> cmp = Comparator.comparing(Customer::getSurname);
        Predicate<Customer> pred = c -> {
            long num = c.getCardNumber();
            return  num > CARD_NUMBER_MIN && num < CARD_NUMBER_MAX;
        };

        group.print(cmp);
        System.out.println();
        group.print(pred);
    }

    private static final long CARD_NUMBER_MIN = 1850000000000000L;
    private static final long CARD_NUMBER_MAX = 1950000000000000L;
}
