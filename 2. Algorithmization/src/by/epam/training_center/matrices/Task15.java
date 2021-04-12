package by.epam.training_center.matrices;

public final class Task15 {
    public static void solution(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int[] row : matrix) {
            for (int el : row) {
                if (el>maxValue) {
                    maxValue = el;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]%2 != 0) {
                    matrix[i][j] = maxValue;
                }
            }
        }
    }
}
