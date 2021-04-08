package by.epam.training_center.arrays;

import java.util.Arrays;

public final class Task8 {
    public static int[] solution(int[] a) {
        int[] resArr = new int[a.length];
        int min = a[0];
        int resLen = 0;
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        for (int num : a) {
            if (num != min) {
                resArr[resLen++] = num;
            }
        }
        return Arrays.copyOf(resArr, resLen);
    }
}
