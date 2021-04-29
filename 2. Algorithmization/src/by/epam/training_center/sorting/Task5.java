package by.epam.training_center.sorting;

public final class Task5 {
    public static void solution(int[] a) {
        int[] b = new int[a.length];
        int size = 1;
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            int index = binarySearch(b, a[i], 0, size - 1);
            size++;
            int buf = a[i];
            for (int j = index; j < size; j++) {
                int swap = b[j];
                b[j] = buf;
                buf = swap;
            }
        }
        System.arraycopy(b, 0, a, 0, a.length);
    }

    private static int binarySearch(int[] a, int value, int low, int high) {
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == value) {
                break;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = ++mid;
            }
        }
        return mid;
    }


}
