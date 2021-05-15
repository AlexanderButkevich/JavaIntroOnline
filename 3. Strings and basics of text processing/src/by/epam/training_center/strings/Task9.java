package by.epam.training_center.strings;

public final class Task9 {
    public static void solution() {

        String in = Task7.inputString();
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for (char chr : in.toCharArray()) {
            if (isUpperCaseChar(chr)) {
                upperCaseCount++;
            } else if (isLowerCaseChar(chr)) {
                lowerCaseCount++;
            }
        }

        System.out.printf("uppercase count = %d\n", upperCaseCount);
        System.out.printf("lowercase count = %d", lowerCaseCount);
    }

    private static boolean isLowerCaseChar(char chr) {
        return chr >= LETTER_A && chr <= LETTER_Z;
    }

    private static boolean isUpperCaseChar(char chr) {
        return chr >= CAPITAL_LETTER_A && chr <= CAPITAL_LETTER_Z;
    }

    private static final char LETTER_A = 'a';
    private static final char LETTER_Z = 'z';
    private static final char CAPITAL_LETTER_A = 'A';
    private static final char CAPITAL_LETTER_Z = 'Z';
}
