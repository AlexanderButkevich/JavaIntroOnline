package by.epam.training_center.branching;

public final class Task5 {
    public static double f(double x) {
        if (x<=3) {
            return x*x - 3*x + 9;
        } else {
            return  1/(x*x*x + 6);
        }
    }
}
