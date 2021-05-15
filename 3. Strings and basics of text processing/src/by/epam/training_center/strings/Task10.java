package by.epam.training_center.strings;

public class Task10 {
    public static int solution(String str) {
        return str.split(REGEX).length;
    }

    private static final String REGEX = "[.!?]";
}
