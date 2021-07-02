package by.epam.training_center.part2.beans.task1;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Aggregation and composition
 */
public class Sentence extends LinkedList<SentencePart> {

    public Sentence(String sentence) {
        super();
        Matcher m = PATTERN.matcher(sentence);
        while (m.find()) {
            add(new Word(m.group(1)));
            add(new SentencePart(m.group(2)));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        forEach(sb::append);
        return sb.toString();
    }

    private static final String REGEX = "(\\w+)(\\W*)";
    private static final Pattern PATTERN = Pattern.compile(REGEX);
}
