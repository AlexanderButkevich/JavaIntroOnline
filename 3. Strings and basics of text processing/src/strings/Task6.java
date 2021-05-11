package strings;

public final class Task6 {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str.length() * 2);
        for (char chr : str.toCharArray()) {
            sb.append(chr).append(chr);
        }
        return sb.toString();
    }
}
