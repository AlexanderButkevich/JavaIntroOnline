package by.epam.training_center.matrices;

import static java.lang.Math.sin;
import static java.lang.Math.pow;

public final class Task7 {
    public static Result solution(int n) {
        Result result = new Result(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.matrix[i][j] = sin((pow(i+1,2) + pow(j+1,2))/n);
                if (result.matrix[i][j] > 0) {
                    result.posCount++;
                }
            }
        }
        return result;
    }

    public static class Result {
        private final double[][] matrix;
        private int posCount;

        public Result(int n) {
            matrix = new double[n][n];
        }

        public double[][] getMatrix() {
            return matrix;
        }

        public int getPosCount() {
            return posCount;
        }
    }
}
