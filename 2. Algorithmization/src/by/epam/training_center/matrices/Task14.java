package by.epam.training_center.matrices;

public final class Task14 {
    public static int[][] solution(int n, int m) {
        if (n<m) {
            return null;
        }
        int[][] matrix = new int[n][m];

        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            while (count < j + 1) {
                int i = (int) (Math.random()*(matrix.length));
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 1;
                    count++;
                }
            }
        }
        return matrix;
    }
}
