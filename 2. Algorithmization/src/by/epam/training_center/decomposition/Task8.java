package by.epam.training_center.decomposition;

public final class Task8 {
    public static int sum(int[] d, int k, int m) {
        int sum = 0;
        for (int i = k - 1; i < m; i++) {
            sum += d[i];
        }
        return sum;
    }
}
