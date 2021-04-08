package by.epam.training_center.arrays;

public final class Task2 {
    public static int solution(double[] a, double z) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                ++count;
            }
        }
        return count;
    }
}
