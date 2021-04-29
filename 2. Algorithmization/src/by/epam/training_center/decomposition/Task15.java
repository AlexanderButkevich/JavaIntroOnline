package by.epam.training_center.decomposition;

import java.util.ArrayList;
import java.util.List;

public final class Task15 {
    private static final int MAX_DIGITS = 9;

    public static int[] solution(int n) {

        List<Integer> result = new ArrayList<>();

        if (n>0 && n<=MAX_DIGITS) {
            Number number = new Number(n);
            do {
                result.add(number.getValue());
            } while (number.next());
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static class Number {
        private final int size;
        private final List<Integer> digits;

        public Number(int n) {
            size = n;
            digits = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                digits.add(i+1);
            }
        }


        public boolean next() {
            int digIndex = size-1 ;
            while (digIndex>=0 && (digits.get(digIndex) == 9 || MAX_DIGITS-digits.get(digIndex)<size-digIndex)) {
                digIndex--;
            }

            if (digIndex<0) {
                return false;
            }

            int count = digits.get(digIndex);
            for (int i = digIndex; i < size; i++) {
                count++;
                digits.set(i, count);
            }
            return true;
        }

        public int getValue() {
            return digits
                    .stream()
                    .reduce(0, (num, dig)->num*10+dig);
        }

    }
}
