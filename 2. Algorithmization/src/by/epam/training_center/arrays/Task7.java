package by.epam.training_center.arrays;

public final class Task7 {
    public static double solution(double[] a) {
        int i1 = 0;
        int i2 = a.length % 2 == 0
            ?
            a.length - 1
            :
            a.length - 2;
        double maxCouple = a[i1] + a[i2];
        while (++i1 < --i2) {
            maxCouple = Math.max(maxCouple, a[i1] + a[i2]);
        }
        return maxCouple;
    }
}
