package by.epam.training_center.strings;

public final class Task5 {
    public static int solution(String str) {
        int count = 0;
        for (char chr : str.toCharArray()) {
            if (chr == LETTER1 || chr == LETTER2) count++;
        }
        return count;
    }

    private static final char LETTER1 = 'a';
    private static final char LETTER2 = 'а';
}
