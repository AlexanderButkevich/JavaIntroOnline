package by.epam.training_center.strings;

public final class Task4 {
    public static String solution() {
        String s1 = INPUT.substring(7,8);
        String s2 = INPUT.substring(3,5);
        return s1 + s2 + s1;
    }

    private static final String INPUT = "информатика";
}
