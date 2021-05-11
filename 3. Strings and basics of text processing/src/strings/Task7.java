package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public final class Task7 {
    public static void solution() {

        String in = inputString();
        String out = getOutputString(in);
        System.out.println(out);

    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    private static String getOutputString(String str) {
        Set<Character> chars = new HashSet<>();
        StringBuilder sb = new StringBuilder(str.length());

        for (char chr : str.toCharArray()) {
            if (chr != SPACE && !chars.contains(chr)) {
                chars.add(chr);
                sb.append(chr);
            }
        }

        return sb.toString();
    }

    private static final char SPACE = ' ';
}
