package by.epam.training_center.arrays;

public final class Task5 {
    public static void solution(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i+1) {
                System.out.printf("a%d = %d\n", i+1, a[i]);
            }
        }
    }
}
