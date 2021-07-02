package by.epam.training_center.part2.beans.task3;

import java.util.Objects;

/**
 * Aggregation and composition
 */
public class Region extends TerritorialEntity<District>{

    public Region() {
        super();
    }

    @Override
    public void add(District entity) {
        if (Objects.isNull(center)) {
            center = entity.center;
        }
        super.add(entity);
    }
}
