package by.epam.training_center.decomposition;

import java.util.ArrayList;
import java.util.List;

public final class Task14 {
    public static int[] solution(int k) {
        List<Integer> result = new ArrayList<>();
        Number number = new Number();

        do {
            number.next();
            if (number.value == number.sum) {
                result.add(number.value);
            }
        } while (number.value < k);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }


    private static class Number {
        private final List<Integer> digits;
        private final List<Integer> powers;
        private int sum;
        private int value;

        public Number() {
            digits = new ArrayList<>(); digits.add(0);
            powers = new ArrayList<>(); powers.add(0);
            sum = 0;
            value = 0;
        }


        public void next() {
            int digIndex = 0;

            do {
                int digit = digits.get(digIndex) + 1;
                if (digit <= 9) {
                    digits.set(digIndex, digit);
                    calcPower(digIndex);
                    break;
                } else if (digIndex == digits.size() - 1) {
                    digits.set(digIndex, 0);
                    digits.add(1);
                    powers.add(0);
                    calcPowers();
                    break;
                } else {
                    digits.set(digIndex, 0);
                    calcPower(digIndex++);
                }
            } while (true);

            value++;
        }

        private void calcPowers() {
            for (int i = 0; i < digits.size(); i++) {
                calcPower(i);
            }
        }

        private void calcPower(int i) {
            int pow = (int) Math.pow(digits.get(i), digits.size());
            sum += pow - powers.get(i);
            powers.set(i, pow);
        }

    }
}
