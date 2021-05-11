package charArrays;

import java.util.Arrays;

public final class Task1 {

    public static void solution(char[][] varNames) {

        for (int i = 0; i < varNames.length; i++) {

            char[] newName = new char[varNames[i].length*2];
            int index = 0;

            for(char chr : varNames[i]) {
                if (chr >= 'A' && chr <= 'Z') {
                    newName[index++] = DELIMITER;
                    newName[index++] = (char) (chr + 32);
                } else {
                    newName[index++] = chr;
                }
            }
            varNames[i] = Arrays.copyOf(newName, index);
        }

    }

    private static final char DELIMITER = '_';
}
