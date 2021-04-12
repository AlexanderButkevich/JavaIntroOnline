package by.epam.training_center.matrices;

public final class Task6 {
    public static int[][] solution(int n) {
        int[][] matrix = new int[n][n] ;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n / 2; j++) {
                matrix[i][j] = 1;
                matrix[n-i-1][j] = 1;
                matrix[i][n-j-1] = 1;
                matrix[n-i-1][n-j-1] = 1;
            }
        }
        return matrix;
    }
}
