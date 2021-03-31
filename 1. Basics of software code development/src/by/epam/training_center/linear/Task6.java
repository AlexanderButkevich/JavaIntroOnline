package by.epam.training_center.linear;

import by.epam.training_center.linear.beans.Point;

public final class Task6 {
    public static void solution(Point point) {
        int x = Math.abs(point.getX());
        int y = point.getY();

        boolean result = y>=-3 && ((x<=2 && y<=4) || (x<=4 && y<=0));
        System.out.print(result);
    }
}
