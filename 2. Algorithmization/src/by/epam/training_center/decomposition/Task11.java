package by.epam.training_center.decomposition;

public final class Task11 {
    public static int digitNumberCompare(int n1, int n2) {
        return digitNumber(n1) - digitNumber(n2);
    }

    private static int digitNumber(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
