package by.epam.training_center.sorting;

public final class Task7 {
    public static int[] solution(int[] a, int[] b) {
        int[] res = new int[b.length];
        int i1 = 0;
        for (int i2 = 0; i2 < b.length; i2++) {
            while (i1 < a.length - 1 && b[i2] > a[i1]) {
                i1++;
            }
            res[i2] = i1;
        }
        return res;
    }
}
