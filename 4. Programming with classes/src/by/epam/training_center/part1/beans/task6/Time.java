package by.epam.training_center.part1.beans.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classes and Objects
 */
public class Time implements Comparable<Time> {
    private int value = 0;

    public Time() {
    }

    public Time(int s) {
        this.value = s;
        fitValue();
    }

    public Time(String time) {
        set(time);
    }

    public void set(String time) {
        Matcher matcher = PARSE_PATTERN.matcher(time);
        int h = 0, m = 0, s = 0;
        if (matcher.find()) {
            h = Integer.parseInt(matcher.group(1));
            m = Integer.parseInt(matcher.group(2));
            s = Integer.parseInt(matcher.group(3));
        }
        set(h, m, s);
    }

    public void set(int h, int m, int s) {
        if (h < MIN_VALUE || h >= HOURS_IN_DAY) h = 0;
        if (m < MIN_VALUE || m >= MINUTES_IN_HOUR) m = 0;
        if (s < MIN_VALUE || s >= SECOND_IN_MIN) s = 0;
        value = s + (m * SECOND_IN_MIN) + (h * MINUTES_IN_HOUR * SECOND_IN_MIN);
    }

    public void setHours(int h) {
        set(h, getMinutes(), getSeconds());
    }

    public void setMinutes(int m) {
        set(getHours(), m, getSeconds());
    }

    public void setSeconds(int s) {
        set(getHours(), getMinutes(), s);
    }

    public void addHours(int h) {
        value += h * MINUTES_IN_HOUR * SECOND_IN_MIN;
        fitValue();
    }

    public void addMinutes(int m) {
        value += m * SECOND_IN_MIN;
        fitValue();
    }

    public void addSeconds(int s) {
        value += s;
        fitValue();
    }

    @Override
    public String toString() {
        return String.format("Time %02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }

    @Override
    public int compareTo(Time that) {
        return this.value - that.value;
    }

    private void fitValue() {
        while (value < MIN_VALUE) {
            value += MAX_VALUE;
        }
        if (value > MAX_VALUE) value = value % MAX_VALUE;
    }

    private int getSeconds() {
        return value % SECOND_IN_MIN;
    }

    private int getMinutes() {
        return (value / SECOND_IN_MIN) % MINUTES_IN_HOUR;
    }

    private int getHours() {
        return value / SECOND_IN_MIN / MINUTES_IN_HOUR;
    }

    private static final int SECOND_IN_MIN = 60;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int HOURS_IN_DAY = 24;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = SECOND_IN_MIN * MINUTES_IN_HOUR * HOURS_IN_DAY;
    private static final String PARSE_REGEX = "(\\d?\\d):(\\d\\d):(\\d\\d)";
    private static final Pattern PARSE_PATTERN = Pattern.compile(PARSE_REGEX);

}
