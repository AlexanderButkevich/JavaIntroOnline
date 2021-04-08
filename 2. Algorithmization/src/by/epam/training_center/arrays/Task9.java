package by.epam.training_center.arrays;

import java.util.*;

public final class Task9 {
    public static int solution(int[] arr) {

        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : arr) {
            int count = counts.getOrDefault(num, 0);
            counts.put(num, ++count);
        }

        int resNum = arr[0];
        int resCnt = counts.get(resNum);

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > resCnt || (entry.getValue() == resCnt && entry.getKey() < resNum)) {
                resCnt = entry.getValue();
                resNum = entry.getKey();
            }
        }

        return resNum;
    }
}
