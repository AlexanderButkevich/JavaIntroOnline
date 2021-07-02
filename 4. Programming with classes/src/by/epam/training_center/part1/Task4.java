package by.epam.training_center.part1;

import by.epam.training_center.part1.beans.task4.Train;
import by.epam.training_center.part1.comparators.task4.TrainArrivalPointComparator;
import by.epam.training_center.part1.comparators.task4.TrainNumberComparator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Classes and Objects
 */
public final class Task4 {
    public static void solution() {
        Train[] trains = {
                new Train("Brest", 605, "08:00:00"),
                new Train("Gomel", 645, "09:00:00"),
                new Train("Vitebsk", 675, "10:00:00"),
                new Train("Grodno", 615, "11:00:00"),
                new Train("Mogilev", 685, "12:00:00"),
        };

        Arrays.sort(trains, new TrainNumberComparator());

        System.out.println(getTrainByNumber(trains));

        Arrays.sort(trains, new TrainArrivalPointComparator());
    }

    private static Train getTrainByNumber(Train[] trains) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        sc.close();
        for (Train train : trains) {
            if (inputNumber == train.getNumber()) {
                return train;
            }
        }
        return null;
    }
}
