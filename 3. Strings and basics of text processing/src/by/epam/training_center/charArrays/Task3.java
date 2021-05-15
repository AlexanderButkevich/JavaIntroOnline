package by.epam.training_center.charArrays;

public final class Task3 {
    public static int solution(char[] str) {
        int count = 0;

        for(char chr : str) {
            if (isDigit(chr)) count++;
        }

        return count;
    }

    public static boolean isDigit(char chr) {
        return chr >= DIG0 && chr <= DIG9;
    }

    private static final char DIG0 = '0';
    private static final char DIG9 = '9';
}
