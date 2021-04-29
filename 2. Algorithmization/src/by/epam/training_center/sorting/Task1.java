package by.epam.training_center.sorting;

import java.util.Arrays;

public final class Task1 {
    public static int[] solution(int[] a, int[] b, int k) {
        a = Arrays.copyOf(a, a.length + b.length);
        for (int i = a.length-1; i >= k; i--) {
            a[i] = i >= k + b.length ? a[i-b.length] : b[i-k];
        }
        return a;
    }
}
