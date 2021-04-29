package by.epam.training_center.sorting;

import java.util.Arrays;

public final class Task2 {
    public static int[] solution(int[] a, int[] b) {
        int indexA = a.length-1;
        int indexB = b.length-1;
        a = Arrays.copyOf(a, a.length + b.length);

        for (int i = a.length-1; indexB>=0; i--) {
            if (a[i] == 0) {
                if (a[indexA] > b[indexB]) {
                    a[i] = a[indexA]; a[indexA--] = 0;
                } else {
                    a[i] = b[indexB--];
                }
            }
        }
        return a;
    }
}
