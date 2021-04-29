package by.epam.training_center.sorting;

public final class Task4 {
    public static int solution(int[] a) {
        int swapCount = 0;
        int swap; boolean flag = true;
        for (int i = a.length-1; i > 0 && flag ; i--) {
            flag = false;
            for (int j = 0; j < i; j++) {
                if (a[j]<a[j+1]) {
                    swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                    swapCount++; flag = true;
                }
            }
        }
        return swapCount;
    }
}
