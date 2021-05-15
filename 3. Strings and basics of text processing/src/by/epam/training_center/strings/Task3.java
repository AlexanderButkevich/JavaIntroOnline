package by.epam.training_center.strings;

public final class Task3 {
    public static boolean solution(String str) {

        int len = str.length();
        int mid = len/2;
        String rightPart = str.substring(mid + len%2);
        String leftPart = new StringBuilder(str.substring(0, mid)).reverse().toString();

        return rightPart.equals(leftPart);
    }
}
