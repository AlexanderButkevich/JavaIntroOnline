package by.epam.training_center.charArrays;

import java.util.Arrays;

public final class Task5 {
    public static char[] solution(char[] str) {

        char[] newStr = new char[str.length];
        int insertIndex = 0;
        boolean atSpace = true;

        for (char chr : str) {
            if (chr != SPACE) {
                newStr[insertIndex++] = chr;
                atSpace = false;
            } else if (!atSpace) {
                newStr[insertIndex++] = chr;
                atSpace = true;
            }
        }

        if (newStr[insertIndex-1] == SPACE) insertIndex--;

        return Arrays.copyOf(newStr, insertIndex);
    }

    private static final char SPACE = ' ';
}
