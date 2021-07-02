package by.epam.training_center.part1;

import by.epam.training_center.part1.beans.task5.DecCounter;

/**
 * Classes and Objects
 */
public final class Task5 {
    public static void solution() {
        DecCounter counter1 = new DecCounter();
        DecCounter counter2 = new DecCounter(700);
        DecCounter counter3 = new DecCounter(-499);

        counter1.inc().inc().inc();
        System.out.println(counter1);

        counter2.dec().dec().dec();
        System.out.println(counter2);

        System.out.println(counter3.dec().dec().dec().getValue());
    }
}
