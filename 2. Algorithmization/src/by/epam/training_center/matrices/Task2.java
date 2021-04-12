package by.epam.training_center.matrices;

public final class Task2 {
    public static void solution(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("a[%d;%d]=%d\n", i+1, i+1, matrix[i][i]);
        }
    }
}
