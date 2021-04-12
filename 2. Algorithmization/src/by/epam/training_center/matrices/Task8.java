package by.epam.training_center.matrices;

import java.util.Scanner;

public final class Task8 {
    public static void solution(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col1, col2, swap;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("column1(1-%d)=", cols);
            col1 = sc.nextInt();
            System.out.printf("column2(1-%d)=", cols);
            col2 = sc.nextInt();
        } while (col1<1 || col2<1 || col1>cols || col2>cols || col1==col2);
        sc.close();
        col1--; col2--;

        for (int i = 0; i < rows; i++) {
            swap = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = swap;
        }
    }
}
