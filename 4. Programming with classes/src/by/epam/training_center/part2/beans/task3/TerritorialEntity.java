package by.epam.training_center.part2.beans.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Aggregation and composition
 */
public abstract class TerritorialEntity<T extends Territory> extends Territory {
    protected List<T> subEntities;

    public TerritorialEntity() {
        super();
        initEntities();
    }

    public TerritorialEntity(City center) {
        super(center);
        initEntities();
    }

    public void add(T entity) {
        subEntities.add(entity);
    }

    @Override
    public double getArea() {
        double totalArea = 0;
        for (T subEntity : subEntities) {
            totalArea += subEntity.getArea();
        }
        return totalArea;
    }

    @Override
    public String toString() {
        return super.toString()  + subEntitiesInfo();
    }

    protected String subEntitiesInfo() {
        StringBuilder sb = new StringBuilder("\n");
        subEntities.forEach(e -> sb.append('\n').append(e));
        return sb.append('\n').toString();
    }

    private void initEntities() {
        subEntities = new ArrayList<>();
    }
}
