package by.epam.training_center.linear;

public final class Task5 {
    public static void solution(long t) {
        int h = (int) (t/3600);
        int m = (int) (t%3600/60);
        int s = (int) (t%60);
        System.out.printf("%dч %dмин %dс", h, m, s);
    }
}
