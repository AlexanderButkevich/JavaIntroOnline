package by.epam.training_center.decomposition;

public final class Task17 {
    public static int solution(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number -= digSum(number);
        }
        return count;
    }

    private static int digSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
