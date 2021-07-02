package by.epam.training_center.part1.comparators.task4;

import by.epam.training_center.part1.beans.task4.Train;

import java.util.Comparator;

/**
 * Classes and Objects
 */
public class TrainNumberComparator implements Comparator<Train> {

    @Override
    public int compare(Train o1, Train o2) {
        return o1.getNumber() - o2.getNumber();
    }

}
