package by.epam.training_center.part2.beans.task1;

/**
 * Aggregation and composition
 */
public class SentencePart {
    private final String value;

    public SentencePart(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
