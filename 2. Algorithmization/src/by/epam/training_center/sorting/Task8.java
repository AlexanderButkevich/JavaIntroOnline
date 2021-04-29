package by.epam.training_center.sorting;

import java.util.Arrays;

public final class Task8 {
    public static void solution(long[] p, long[] q) {
        long lcm = lcm(q);
        for (int i = 0; i < p.length; i++) {
            p[i] = (lcm / q[i]) * p[i];
            q[i] = lcm;
        }
        Arrays.sort(p);
    }

    private static long lcm(long ... nums) {
        long max = nums[0];
        for (long num : nums) max = Math.max(max, num);
        long lcm = 0;
        boolean found;

        do {
            found = true;
            lcm += max;
            for (long num : nums) {
                if (lcm % num != 0) {
                    found = false;
                    break;
                }
            }
        } while (!found);
        return lcm;
    }
}
