package by.epam.training_center.decomposition;

import java.util.ArrayList;
import java.util.List;

public final class Task13 {
    public static int[][] solution(int n) {

        List<int[]> result = getPairs(n);

        return getArray(result);
    }


    private static boolean isPrime(List<Integer> primes, int number) {
        for (Integer prime : primes) {
            if (number%prime == 0) {
                return false;
            }
        }
        primes.add(number);
        return true;
    }

    private static List<int[]> getPairs(int n) {
        List<int[]> result = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();
        int prevPrime = 2;

        for (int i = 2; i <= 2*n ; i++) {
            if (isPrime(primes, i)) {
                if (prevPrime >= n && i-prevPrime == 2) {
                    result.add(new int[] {prevPrime, i});
                }
                prevPrime = i;
            }
        }

        return result;
    }

    private static int[][] getArray(List<int[]> list) {
        int[][] arr = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
