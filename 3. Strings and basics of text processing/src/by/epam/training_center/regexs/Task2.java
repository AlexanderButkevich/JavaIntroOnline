package by.epam.training_center.regexs;

import by.epam.training_center.regexs.beans.Node;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task2 {

    /**
     * xml file content
     */
    private static String content;

    /**
     * matcher
     */
    private static Matcher matcher;

    /**
     * next node is found
     */
    private static boolean found = false;

    /**
     * next node not found
     */
    private static boolean endOfFile = false;

    /**
     * pattern
     */
    private final static Pattern pattern;

    /**
     * load new content from file
     * @param filename to read
     */
    public static void load(String filename) {
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(new FileReader(filename))) {
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        content = sb.toString();
        reset();
    }

    /**
     * @return next node, if found
     */
    public static Node next() {
        if (!found) return null;

        String openingTagName = matcher.group(1);
        String openingTagPars = matcher.group(2);
        String closingTagName = matcher.group(3);
        String bodilessTagName = matcher.group(4);
        String bodilessTagPars = matcher.group(5);
        String content = matcher.group(6);

        Node.NodeType type;
        String value, parameters = null;

        if (Objects.nonNull(openingTagName)) {
            type = Node.NodeType.OPENING_TAG;
            value = openingTagName;
            parameters = openingTagPars;
        } else if (Objects.nonNull(closingTagName)) {
            type = Node.NodeType.CLOSING_TAG;
            value = closingTagName;
        } else if (Objects.nonNull(bodilessTagName)) {
            type = Node.NodeType.BODILESS_TAG;
            value = bodilessTagName;
            parameters = bodilessTagPars;
        } else {
            type = Node.NodeType.CONTENT;
            value = content;
        }
        found = false;

        return new Node(type, value, parameters);
    }

    /**
     * reset matcher
     */
    public static void reset() {
        matcher = pattern.matcher(content);
        found = false;
        endOfFile = false;
    }

    /**
     * finds next node
     * @return true if found
     */
    public static boolean hasNext() {
        if (!found && !endOfFile) {
            found = matcher.find();
            endOfFile = !found;
        }
        return found;
    }


    private static final String OPENING_TAG_REGEX = "<([^<>\\W]+)( [^<>]+)?>"; //       1   2
    private static final String CLOSING_TAG_REGEX = "</([^<>\\W]+)>";          //       3
    private static final String BODILESS_TAG_REGEX = "<([^<>\\W]+) ?( [^<>]+)?/>";//    4   5
    private static final String CONTENT = "([^<>]*[^<>\\s]+[^<>])(?=</)";                           //    6
    private static final String REGEX_DELIMITER = "|";

    static  {
        pattern = Pattern.compile(
                OPENING_TAG_REGEX + REGEX_DELIMITER +
                        CLOSING_TAG_REGEX + REGEX_DELIMITER +
                        BODILESS_TAG_REGEX + REGEX_DELIMITER +
                        CONTENT
        );
    }
}
