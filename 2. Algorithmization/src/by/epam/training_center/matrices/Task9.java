package by.epam.training_center.matrices;

public final class Task9 {
    public static Result solution(int[][] matrix) {
        Result result = new Result(matrix[0].length);

        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                result.colSum[j] += row[j];
                if (result.colSum[j] > result.colSum[result.maxSumCol]) {
                    result.maxSumCol = j;
                }
            }
        }
        result.maxSumCol++;
        return result;
    }

    public static class Result {
        private final int[] colSum;
        private int maxSumCol;

        public Result(int size) {
            colSum = new int[size];
        }

        public int[] getColSum() {
            return colSum;
        }

        public int getMaxSumCol() {
            return maxSumCol;
        }
    }
}
