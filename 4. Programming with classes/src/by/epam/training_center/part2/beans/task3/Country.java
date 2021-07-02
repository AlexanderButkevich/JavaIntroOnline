package by.epam.training_center.part2.beans.task3;

/**
 * Aggregation and composition
 */
public class Country extends TerritorialEntity<Region> {

    public Country(City capital) {
        super(capital);
    }

    @Override
    public String toString() {
        return "Country \nCapital: " + center + subEntitiesInfo() +
                "total area = " + getArea();
    }
}
