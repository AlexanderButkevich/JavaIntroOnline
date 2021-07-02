package by.epam.training_center.part2.beans.task3;

/**
 * Aggregation and composition
 */
public class City {
    private final String name;

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
