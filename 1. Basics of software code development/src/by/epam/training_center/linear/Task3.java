package by.epam.training_center.linear;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

public final class Task3 {
    public static double solution(double x, double y) {
        return (sin(x) + cos(y))
                / (cos(x) - sin(y))
                * tan(x*y);
    }
}
