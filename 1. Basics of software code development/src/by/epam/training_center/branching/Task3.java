package by.epam.training_center.branching;

import by.epam.training_center.branching.beans.Line;
import by.epam.training_center.branching.beans.Point;

public final class Task3 {
    public static boolean solution(Point a, Point b, Point c) {
        Line line = new Line(a,b);
        return line.atPoint(c);
    }
}
