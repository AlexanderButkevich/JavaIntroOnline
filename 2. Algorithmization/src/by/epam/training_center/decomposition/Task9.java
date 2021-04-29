package by.epam.training_center.decomposition;

public final class Task9 {
    public static double quadrangleArea(double x, double y, double z, double t) {
        double sepLine = Math.sqrt(x*x + y*y);
        double segment1 = triangleArea(x, y, sepLine);
        double segment2 = triangleArea(z, t, sepLine);
        return segment1 + segment2; // +/-
    }

    private static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
