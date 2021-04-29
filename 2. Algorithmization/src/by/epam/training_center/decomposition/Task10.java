package by.epam.training_center.decomposition;

import java.util.Arrays;

public final class Task10 {
    public static int[] getDigits(long n) {
        final int MAX_LONG_DIGITS = 20;
        int[] digits = new int[MAX_LONG_DIGITS];
        int i = MAX_LONG_DIGITS;
        while (n > 0) {
            digits[--i] = (int) (n%10);
            n /= 10;
        }
        return Arrays.copyOfRange(digits, i, MAX_LONG_DIGITS);
    }
}
