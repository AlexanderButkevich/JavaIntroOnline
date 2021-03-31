package by.epam.training_center.cycles;

public final class Task6 {
    public static void solution() {
        for (int i = 32; i <= Character.MAX_VALUE; i++) {
            System.out.printf("%d - %c\n", i, i);
        }
    }
}
