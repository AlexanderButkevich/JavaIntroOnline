package by.epam.training_center.matrices;

import java.util.Random;

public final class Task11 {
    public static void solution() {
        int[][] matrix = new int[10][20];
        int[] colNum = new int[matrix.length]; int size = 0;
        final int MIN = 0;
        final int MAX = 15;
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*(1+MAX-MIN) + MIN);
                System.out.printf("%3d", matrix[i][j]);
                if (matrix[i][j]==5) {
                    count++;
                }
            }
            System.out.println();
            if (count>=3) {
                colNum[size++] = i + 1;
            }
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.printf("%3d", colNum[i]);
        }
    }
}
