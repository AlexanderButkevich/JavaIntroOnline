package charArrays;

import static charArrays.Task3.isDigit;

public final class Task4 {
    public static int solution(char[] str) {

        int count = 0;
        boolean atDigit = false;

        for (char chr : str) {
            if (isDigit(chr)) {
                if (!atDigit) {
                    count++;
                    atDigit = true;
                }
            } else {
                atDigit = false;
            }
        }

        return count;
    }
}
