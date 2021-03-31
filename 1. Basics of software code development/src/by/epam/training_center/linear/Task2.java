package by.epam.training_center.linear;

public final class Task2 {
    public static double solution(double a, double b, double c) {
        return (b + Math.sqrt(b*b+4*a*c))
                / (2*a)
                - Math.pow(a,3) * c
                + Math.pow(b, -2);
    }
}
