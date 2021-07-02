package by.epam.training_center.part1.comparators.task4;

import by.epam.training_center.part1.beans.task4.Train;

import java.util.Comparator;

/**
 * Classes and Objects
 */
public class TrainArrivalPointComparator implements Comparator<Train> {
    @Override
    public int compare(Train o1, Train o2) {
        int result = o1.getArrivalPoint().compareTo(o2.getArrivalPoint());
        if (result == 0) {
            result = o1.getDepartureTime().compareTo(o2.getDepartureTime());
        }
        return result;
    }
}
