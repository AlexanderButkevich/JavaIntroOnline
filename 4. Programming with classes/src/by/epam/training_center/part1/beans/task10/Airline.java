package by.epam.training_center.part1.beans.task10;

import by.epam.training_center.part1.beans.task6.Time;

import java.time.DayOfWeek;
import java.util.HashSet;
import java.util.Set;

/**
 * Classes and Objects
 */
public class Airline {
    private String destination;
    private String flight;
    private String aircraft;
    private Time depTime;
    private final Set<DayOfWeek> depDays;

    public Airline() {
        depDays = new HashSet<>();
    }

    public Airline(String destination, String flight, String aircraft, String depTime, int ... daysOfWeek) {
        this();
        setDestination(destination);
        setFlight(flight);
        setAircraft(aircraft);
        setDepTime(depTime);
        for (int day : daysOfWeek) {
            depDays.add(DayOfWeek.of(day));
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Time getDepTime() {
        return depTime;
    }

    public void setDepTime(Time depTime) {
        this.depTime = depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = new Time(depTime);
    }

    public void addDay(DayOfWeek day) {
        depDays.add(day);
    }

    public void removeDay(DayOfWeek day) {
        depDays.remove(day);
    }

    public boolean onDay(DayOfWeek day) {
        return depDays.contains(day);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flight='" + flight + '\'' +
                ", aircraft='" + aircraft + '\'' +
                ", depTime=" + depTime +
                ", depDays=" + depDays +
                '}';
    }
}
