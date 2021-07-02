package by.epam.training_center.part2;

import by.epam.training_center.part2.beans.task4.Account;
import by.epam.training_center.part2.beans.task4.Client;

/**
 * Aggregation and composition
 */
public final class Task4 {
    public static Client solution() {
        Client client = new Client("Davide Nardella");

        client.addAccount(new Account("1000500025A", 3500));
        client.addAccount(new Account("1000500026A", 12500));
        client.addAccount(new Account("1000500027A", -500));
        client.addAccount(new Account("1000500028A", 10000));
        client.addAccount(new Account("1000500030B", -35000));
        client.addAccount(new Account("1000500031B", 100000));
        client.addAccount(new Account("1000500032B", 1500));

        return client;
    }
}
