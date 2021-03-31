package by.epam.training_center.branching;

import static java.lang.Math.min;
import static java.lang.Math.max;

public final class Task2 {
    public static double solution(double a, double b, double c, double d) {
        return max(min(a,b), min(c,d));
    }
}
