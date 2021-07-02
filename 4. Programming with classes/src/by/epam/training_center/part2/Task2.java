package by.epam.training_center.part2;

import by.epam.training_center.part2.beans.task2.Automobile;

/**
 * Aggregation and composition
 */
public final class Task2 {
    public static Automobile solution() {
        Automobile automobile = new Automobile("opel", "1400CFI", "Matador", 100);

        automobile.refuel();
        automobile.changeWheel(1, new Automobile.Wheel("Michelin"));
        automobile.changeWheel(2, new Automobile.Wheel("Michelin"));

        automobile.startEngine();
        automobile.drive();

        return automobile;
    }
}
