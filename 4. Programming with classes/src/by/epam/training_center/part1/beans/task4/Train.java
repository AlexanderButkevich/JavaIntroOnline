package by.epam.training_center.part1.beans.task4;

import java.time.LocalTime;

/**
 * Classes and Objects
 */
public class Train {
    private final String arrivalPoint;
    private final int number;
    private final LocalTime departureTime;

    public Train(String arrivalPoint, int number, String departureTime) {
        this.arrivalPoint = arrivalPoint;
        this.number = number;
        this.departureTime = LocalTime.parse(departureTime);
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public int getNumber() {
        return number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "arrivalPoint='" + arrivalPoint + '\'' +
                ", number=" + number +
                ", departureTime=" + departureTime +
                '}';
    }

}
