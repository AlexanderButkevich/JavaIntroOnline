package by.epam.training_center.part2.beans.task1;

import java.util.LinkedList;

/**
 * Aggregation and composition
 */
public class Text extends LinkedList<Sentence> {
    private String title;

    public Text(String title, String text) {
        this.title = title;
        String[] tokens = text.split(REGEX);
        for (String token : tokens) {
            add(new Sentence(token));
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        forEach(sent -> sb.append(sent).append(NEW_LINE));
        System.out.println(sb);
    }

    public void printTitle() {
        System.out.println(title);
    }

    @Override
    public String toString() {
        return "Text{" +
                "title='" + title + '\'' +
                '}';
    }

    private static final String REGEX = "(?<=([.!?]))";
    private static final String NEW_LINE = "\n\r";
}
