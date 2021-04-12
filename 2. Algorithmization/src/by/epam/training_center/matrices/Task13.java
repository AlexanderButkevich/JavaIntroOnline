package by.epam.training_center.matrices;

public final class Task13 {
    public static void solution(int[][] matrix, boolean natDir) {
        for (int j = 0; j < matrix[0].length; j++) {
            int swap;
            boolean swapped = true;
            for (int k = matrix.length - 1; k > 0 && swapped; k--) {
                swapped = false;
                for (int i = 0; i < k; i++) {
                    if ((natDir && matrix[i][j] > matrix[i+1][j]) ||
                            (!natDir && matrix[i][j] < matrix[i+1][j])) {
                        swapped = true;
                        swap = matrix[i][j];
                        matrix[i][j] = matrix[i+1][j];
                        matrix[i+1][j] = swap;
                    }
                }
            }
        }
    }
}
