package by.epam.training_center.arrays;

public final class Task1 {
    public static int solution(int[] a, int k) {
        int sum = 0;
        for (int num : a) {
            if (num % k == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
