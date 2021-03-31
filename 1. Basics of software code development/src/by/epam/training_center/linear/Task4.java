package by.epam.training_center.linear;

public final class Task4 {
    public static void solution(double r) {
        int n = (int)r;
        int d = (int)(r*1000)%1000;
        double result = d + n/1000.;
        System.out.print(result);
    }
}
