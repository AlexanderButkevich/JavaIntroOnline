package by.epam.training_center.cycles;

public final class Task3 {
    public static void solution() {
        long result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i*i;
        }
        System.out.println(result);
    }
}
