package by.epam.training_center.branching;

import by.epam.training_center.branching.beans.Brick;
import by.epam.training_center.branching.beans.Hole;

public final class Task4 {
    public static boolean solution(Hole hole, Brick brick) {
        return hole.isFit(brick);
    }
}
