package by.epam.training_center.part1.beans.task5;

/**
 * Classes and Objects
 */
public class DecCounter {
    private int value = DEFAULT_VALUE;

    public DecCounter() {
    }

    public DecCounter(int value) {
        this.value = value;
        checkRanges();
    }

    public int getValue() {
        return value;
    }

    public DecCounter inc() {
        value++;
        checkRanges();
        return this;
    }

    public DecCounter dec() {
        value--;
        checkRanges();
        return this;
    }

    @Override
    public String toString() {
        return "DecCounter{" +
                "value=" + value +
                '}';
    }

    private void checkRanges() {
        if (value > MAX_VALUE) value = MAX_VALUE;
        if (value < MIN_VALUE) value = MIN_VALUE;
    }

    private static final int DEFAULT_VALUE = 0;
    private static final int MAX_VALUE = 500;
    private static final int MIN_VALUE = -500;
}
