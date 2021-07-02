package by.epam.training_center.part2.beans.task3;

/**
 * Aggregation and composition
 */
public class District extends Territory {
    private final double area;

    public District(String center, double area) {
        super(center);
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
