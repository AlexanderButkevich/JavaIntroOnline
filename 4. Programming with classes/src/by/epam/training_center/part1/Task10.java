package by.epam.training_center.part1;

import by.epam.training_center.part1.beans.task10.Airline;
import by.epam.training_center.part1.beans.task10.AirlinesAgg;
import by.epam.training_center.part1.beans.task6.Time;

import java.time.DayOfWeek;
import java.util.function.Predicate;

/**
 * Classes and Objects
 */
public final class Task10 {
    public static void solution() {

        AirlinesAgg airlines = new AirlinesAgg() {{
            add(
                    new Airline("Sochi", "ABG225", "Boeing 737-8K5", "14:00:00", 6, 7),
                    new Airline("Moscow", "AFL2403", "Airbus A321-211", "10:00:00", 1,2,3,5,6,7),
                    new Airline("Moscow", "AFL2551", "Boeing 737-8MC", "14:00:00", 4,5,6,7),
                    new Airline("Vienna", "QTR52PW", "Boeing 777-3DZ(ER)", "06:15:00", 1,2,3,5,6,7),
                    new Airline("London", "AIC130", "Boeing 787-8 Dreamliner", "18:00:00", 1,2,3,5,6,7),
                    new Airline("Athens", "DLH9921", "Airbus A321-231", "22:00:00", 5,6,7),
                    new Airline("Bogota", "AFR429", "Boeing 787-9 Dreamliner", "07:00:00", 1,4),
                    new Airline("Barcelona", "TAP104A", "Airbus A319-111", "11:00:00", 1,2,3,4,5,6,7),
                    new Airline("Paris", "AFR45AA", "Embraer", "22:30:00", 1,2,3,5,6,7)
            );
        }};

        Predicate<Airline> pred1 = airline -> airline.getDestination().equals(DESTINATION);
        Predicate<Airline> pred2 = airline -> airline.onDay(DayOfWeek.THURSDAY);
        Predicate<Airline> pred3 = airline -> pred2.test(airline) && airline.getDepTime().compareTo(DEP_TIME) > 0;

        airlines.print(pred1);
        System.out.println();

        airlines.print(pred2);
        System.out.println();

        airlines.print(pred3);
    }



    private static final String DESTINATION = "Moscow";
    private static final Time DEP_TIME = new Time("10:00:00");
}
