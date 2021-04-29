package by.epam.training_center.decomposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Task12 {
    public static int[] solution(int k, int n) {
        List<Integer> result = new ArrayList<>();

        int number = getFirstNumber(k);
        List<Integer> digits = getDigits(number);

        while (number <= n) {
            result.add(number);
            nextNumber(digits);
            number = getNumberByDigits(digits);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int getFirstNumber(int sum) {
        int nines = sum / 9;
        int number = sum - nines * 9;

        while (nines-- > 0) {
            number = number * 10 + 9;
        }
        return number;
    }

    private static List<Integer> getDigits(int num) {
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            int digit = num % 10;
            digits.add(digit);
            num /= 10;
        }
        return digits;
    }

    private static int getNumberByDigits(List<Integer> digits) {
        return reverseList(digits)
                .stream()
                .reduce(0, (num, dig)->num*10+dig);
    }

    private static <T> List<T> reverseList(List<T> list) {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }

    private static void nextNumber(List<Integer> digits) {
        int size = digits.size();
        int sourcePos = -1;
        int sourceValue;

        do {
            sourcePos++;
            sourceValue = digits.get(sourcePos);
        } while (sourceValue == 0 || (sourcePos < size-1 && digits.get(sourcePos+1) == 9));

        if (sourcePos == size-1) {
            digits.add(0);
        }

        digits.set(sourcePos+1, digits.get(sourcePos+1) + 1);
        sourceValue--;

        for (int i = 0; i < sourcePos && sourceValue > 0 ; i++) {
            int value = digits.get(i);
            if (value == 9) {
                continue;
            }

            int newValue = Math.min(value + sourceValue, 9);
            sourceValue -= newValue - value;
            value = newValue;

            digits.set(i, value);
        }
        digits.set(sourcePos, sourceValue);
    }

}
