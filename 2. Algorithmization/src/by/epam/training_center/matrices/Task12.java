package by.epam.training_center.matrices;

public final class Task12 {
    public static void solution(int[][] matrix, boolean natDir) {
        for (int[] row : matrix) {
            int swap;
            boolean swapped = true;
            for (int k = row.length - 1; k > 0 && swapped; k--) {
                swapped = false;
                for (int j = 0; j < k; j++) {
                    if ((natDir && row[j] > row[j+1]) ||
                            (!natDir && row[j] < row[j+1])) {
                        swapped = true;
                        swap = row[j];
                        row[j] = row[j+1];
                        row[j+1]=swap;
                    }
                }
            }
        }
    }
}
