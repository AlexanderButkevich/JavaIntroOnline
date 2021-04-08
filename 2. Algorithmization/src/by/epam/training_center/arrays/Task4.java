package by.epam.training_center.arrays;

public final class Task4 {
    public static void solution(double[] a) {
        int minIndex = 0;
        int maxIndex = 0;
        double swap;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        swap = a[minIndex];
        a[minIndex] = a[maxIndex];
        a[maxIndex] = swap;
    }
}
