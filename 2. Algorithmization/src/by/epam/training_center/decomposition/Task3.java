package by.epam.training_center.decomposition;

public final class Task3 {
    public static double hexagonArea(double a) {
        return 6 * triangleArea(a);
    }

    private static double triangleArea(double a) {
        final double CONST = Math.pow(3, 0.5) / 4;
        return Math.pow(a, 2) * CONST;
    }
}
