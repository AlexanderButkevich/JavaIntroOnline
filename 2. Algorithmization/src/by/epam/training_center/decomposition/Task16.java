package by.epam.training_center.decomposition;

public final class Task16 {
    private final static int FIRST_EVEN_DIG = 1;
    private final static int LAST_EVEN_DIG = 9;

    public static Result solution(int n) {

        int number = getNumber(n, FIRST_EVEN_DIG);
        int lastNumber = getNumber(n, LAST_EVEN_DIG);

        long sum = 0;
        while (number <= lastNumber) {
            sum += number;
            number = nextNumber(number);
        }

        return new Result(sum ,evenDigitAmount(sum));
    }

    private static int getNumber(int len, int dig) {
        int number = dig;
        for (int i = 1; i < len; i++) {
            number = number*10 + dig;
        }
        return number;
    }

    private static int nextNumber(int number) {
        int shift = 1;
        int aux = number;
        while (aux % 10 == 9) {
            aux /= 10;
            if (aux != 0) {
                shift = shift*10 + 1;
            }
        }
        return shift == 1 ? number + 2 : number + shift + 1;
    }

    private static int evenDigitAmount(long number) {
        int count = 0;
        while (number>0) {
            int digit = (int) (number % 10);
            if (isEven(digit)) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static class Result {
        private final long sum;
        private final int evenCount;

        public Result(long sum, int evenCount) {
            this.sum = sum;
            this.evenCount = evenCount;
        }

        public long getSum() {
            return sum;
        }

        public int getEvenCount() {
            return evenCount;
        }
    }
}
