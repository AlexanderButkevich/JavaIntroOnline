package by.epam.training_center.sorting;

public final class Task3 {
    public static void solution(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int maxIndex = i;
            int swap = a[i];

            for (int j = i+1; j < a.length; j++) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }

            a[i] = a[maxIndex];
            a[maxIndex] = swap;
        }
    }
}
