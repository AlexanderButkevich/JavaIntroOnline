package strings;

public final class Task2 {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str.length()*2);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch == CHAR ? INS : ch);
        }

        return sb.toString(); // str.replaceAll("a", "ab");
    }

    private static final char CHAR = 'a';
    private static final String INS = "ab";
}
