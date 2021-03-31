package by.epam.training_center.cycles;

public final class Task2 {
    public static void solution(double a, double b, double h) {

        double point = (int)(a/h)*h;
        if (a>0 && point!=a) {
            point += h;
        }

        while (point <= b) {
            System.out.printf("y(%.2f)=%.2f\n", point, y(point));
            point += h;
        }

    }
    private static double y(double x) {
        return x>2 ? x : -x;
    }
}
