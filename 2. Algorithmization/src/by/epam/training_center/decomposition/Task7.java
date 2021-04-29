package by.epam.training_center.decomposition;

public final class Task7 {
    public static int solution() {
        int sum = 0;
        for (int i = 1; i <= 9; i += 2) {
            sum += factorial(i);
        }
        return sum;
    }

    private static int factorial(int n) {
        return n < 2 ? 1 : n * factorial(n - 1);
    }
}
