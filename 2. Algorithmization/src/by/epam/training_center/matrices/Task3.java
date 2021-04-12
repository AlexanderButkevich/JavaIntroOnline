package by.epam.training_center.matrices;

public final class Task3 {
    public static void solution(int[][] matrix, int k, int p) {
        for (int j = 0; j < matrix[k-1].length; j++) {
            System.out.printf("a[%d;%d]=%d\n", k, j+1, matrix[k-1][j]);
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("a[%d;%d]=%d\n", i+1, p, matrix[i][p-1]);
        }
    }
}
