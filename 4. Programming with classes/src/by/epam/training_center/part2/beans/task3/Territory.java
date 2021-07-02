package by.epam.training_center.part2.beans.task3;

/**
 * Aggregation and composition
 */
public abstract class Territory {
    protected City center;

    public Territory() {
    }

    public Territory(City center) {
        this.center = center;
    }

    public Territory(String center) {
        this.center = new City(center);
    }

    public City getCenter() {
        return center;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return center + " " + this.getClass().getSimpleName() + ", area = " + this.getArea();
    }

}
