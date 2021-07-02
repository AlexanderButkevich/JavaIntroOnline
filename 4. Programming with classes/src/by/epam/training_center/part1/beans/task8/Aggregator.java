package by.epam.training_center.part1.beans.task8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Classes and Objects
 */
public class Aggregator<T> {
    private Object[] items;
    private int size;

    protected Aggregator() {
        this(DEFAULT_CAPACITY);
    }

    protected Aggregator(int capacity) {
        items = new Object[capacity];
    }

    public int size() {
        return size;
    }

    @SafeVarargs
    public final void add(T... items) {
        checkCapacity(items.length);
        System.arraycopy(items, 0, this.items, size, items.length);
        size += items.length;
    }

    public final void remove(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[--size] = null;
        }
    }

    public final void removeAll() {
        items = new Object[Math.max(size, DEFAULT_CAPACITY)];
        size = 0;
    }

    public final void print() {
        itemStream()
                .forEach(System.out::println);
    }

    public final void print(Comparator<T> cmp) {
        itemStream()
                .sorted(cmp)
                .forEach(System.out::println);
    }

    public final void print(Predicate<T> predicate) {
        itemStream()
                .filter(predicate)
                .forEach(System.out::println);
    }

    private void checkCapacity(int addSize) {
        if (size + addSize > items.length) {
            int extCap = (int) (items.length * 1.5);
            items = Arrays.copyOf(items, extCap);
        }
    }

    private Stream<T> itemStream() {
        return Arrays.stream(items)
                .filter(Objects::nonNull)
                .map(o -> (T) o);
    }

    protected static final int DEFAULT_CAPACITY = 10;
}
