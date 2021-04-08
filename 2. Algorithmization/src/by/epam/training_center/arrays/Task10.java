package by.epam.training_center.arrays;

public final class Task10 {
    public static void solution(int[] arr) {
        if (arr.length >= 2) {
            arr[arr.length - 1] = 0;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                arr[j] = arr[j+1];
            }
        }
    }
}
