package by.epam.training_center.branching;

public final class Task1 {
    public static void solution(double angle1, double angle2) {
        double angle3 = 180 - angle1 - angle2;
        boolean isExist = false;
        boolean isRectangular = false;
        if (angle1 > 0 && angle2 > 0 && angle3 > 0) {
            isExist = true;
            if (angle1 == 90. || angle2 == 90. || angle3 == 90.) {
                isRectangular = true;
            }
        }
        System.out.printf("%striangle is %sexist",
                isRectangular ? "rectangular " : "",
                isExist ? "" : "not ");
    }
}
