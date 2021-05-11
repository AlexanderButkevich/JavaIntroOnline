package regexs;

import strings.Task10;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Task1 {

    private static String string;

    public static String solution1() {
        return string
                .lines()
                .sorted(Comparator.comparingInt(Task10::solution))
                .collect(Collectors.joining(NEW_LINE_REGEX));
    }

    public static String solution2() {
        return sortWordsByComparator(string, Comparator.comparingInt(String::length));
    }

    public static String solution3(char chr) {
        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return charCount(chr, o2) - charCount(chr, o1);
            }
        }.thenComparing(Comparator.naturalOrder());

        return sortWordsByComparator(string, cmp);
    }

    private static String sortWordsByComparator(String str, Comparator<String> cmp) {
        return str
                .lines()
                .map(paragraph -> Stream
                        .of(paragraph.split(SENTENCES_DELIMITER_REGEX))
                        .map(sentence -> {
                            String lastMark = getLastMark(sentence);
                            sentence = trimLastMark(sentence);
                            return Stream
                                    .of(sentence.split(WORDS_DELIMITER_REGEX))
                                    .sorted(cmp)
                                    .collect(Collectors.joining(SPACE)) + lastMark;
                        })
                        .collect(Collectors.joining(SPACE)))
                .collect(Collectors.joining(NEW_LINE_REGEX));
    }

    private static String getLastMark(String str) {
        int length = str.length();
        return length > 0 ? str.substring(length - 1, length) : "";
    }

    private static String trimLastMark(String str) {
        str = str.trim();
        int length = str.length();
        return length > 1 ? str.substring(0, length - 1) : "";
    }

    private static int charCount(char chr, String str) {
        return str
                .chars()
                .reduce(0, (ac, val) -> val == chr ? ac + 1 : ac);
    }

    public static String getString() {
        return string;
    }

    public static void setString(String string) {
        Task1.string = string;
    }

    private static final String NEW_LINE_REGEX = "\n";
    private static final String SENTENCES_DELIMITER_REGEX = "(?<=[.!?])";
    private static final String WORDS_DELIMITER_REGEX = "[^\\w\\d]+";
    private static final String SPACE = " ";
}
