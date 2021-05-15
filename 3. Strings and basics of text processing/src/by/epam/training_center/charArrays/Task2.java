package by.epam.training_center.charArrays;

import java.util.Arrays;

public final class Task2 {
    public static char[] solution(char[] str) {

        char[] newStr = new char[str.length*2];
        int insertIndex = 0;

        for (int i = 0; i < str.length; i++) {
            if (find(str, i)) {

                replace(newStr, insertIndex);

                insertIndex += REP_TO.length;
                i += REP_FROM.length-1;
            } else {
                newStr[insertIndex++] = str[i];
            }
        }

        return Arrays.copyOf(newStr, insertIndex);
    }

    private static boolean find(char[] str, int offset) {
        boolean result = true;
        for (int i = 0; i < REP_FROM.length; i++) {
            if(i+offset >= str.length || str[i+offset] != REP_FROM[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static void replace(char[] str, int insertIndex) {
        System.arraycopy(REP_TO, 0, str, insertIndex, REP_TO.length);
    }

    private static final char[] REP_FROM = "word".toCharArray();
    private static final char[] REP_TO = "letter".toCharArray();
}
