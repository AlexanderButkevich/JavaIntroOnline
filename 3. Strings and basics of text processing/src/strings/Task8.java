package strings;

public final class Task8 {
    public static void solution() {

        String in = Task7.inputString();
        String out = getOutputString(in);

        System.out.println(out);

    }

    private static String getOutputString(String str) {
        String[] words = str.split(DELIMITER);
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    private static final String DELIMITER = " ";
}
