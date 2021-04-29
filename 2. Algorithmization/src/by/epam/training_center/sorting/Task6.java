package by.epam.training_center.sorting;

public final class Task6 {
    public static void solution(int[] a) {
        int i = 0;
        while (i < a.length - 1) {
            if (a[i] > a[i+1]) {
                int swap = a[i];
                a[i] = a[i+1];
                a[i+1] = swap;
                i = i > 0 ? i - 1 : 1;
            } else {
                i++;
            }
        }
    }
}
