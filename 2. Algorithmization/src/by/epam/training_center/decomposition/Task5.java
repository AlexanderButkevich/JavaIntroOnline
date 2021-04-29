package by.epam.training_center.decomposition;

public final class Task5 {
    public static int getPreviousMax(int[] a) {
        int max = Integer.MIN_VALUE;
        int prevMax = max;

        for (int num : a) {
            if (num >= max) {
                prevMax = max;
                max = num;
            } else if (num > prevMax) {
                prevMax = num;
            }
        }

        return prevMax;
    }
}
