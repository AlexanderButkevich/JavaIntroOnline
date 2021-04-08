package by.epam.training_center.arrays;

public final class Task6 {
    public static double solution(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i+1)) {
                sum += arr[i];
            }
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        boolean isPrime = num > 1;
        int div = 2;
        while ((div*div <= num) && isPrime) {
            if (num % div == 0) {
                isPrime = false;
            }
            ++div;
        }
        return isPrime;
    }
}
