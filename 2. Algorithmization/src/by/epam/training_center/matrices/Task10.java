package by.epam.training_center.matrices;

import java.util.Arrays;

public final class Task10 {
    public static int[] solution(int[][] matrix) {
        int[] result = new int[matrix.length];
        int size = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i]>0) {
                result[size++] = matrix[i][i];
            }
        }
        return Arrays.copyOf(result, size);
    }
}
