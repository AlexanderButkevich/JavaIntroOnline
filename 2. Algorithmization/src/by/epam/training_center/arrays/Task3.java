package by.epam.training_center.arrays;

public final class Task3 {
    private static double[] arr;

    public static double[] getArr() {
        return arr;
    }

    public static void setArr(double[] arr) {
        Task3.arr = arr;
    }

    public static Result solution() {
        Result result = new Result();
        for (double num : arr) {
            if (num > 0) {
                result.posCount++;
            } else if (num < 0) {
                result.negCount++;
            } else {
                result.zerCount++;
            }
        }
        return result;
    }

    public static class Result {
        private int negCount;
        private int posCount;
        private int zerCount;

        public int getNegCount() {
            return negCount;
        }

        public int getPosCount() {
            return posCount;
        }

        public int getZerCount() {
            return zerCount;
        }
    }
}
