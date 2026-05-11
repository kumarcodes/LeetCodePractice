package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 5, 6, 5, 6};
        int result = findSingleNumber(arr);
        System.out.println(result);
    }

    private static int findSingleNumber(int[] arr) {
        final Integer[] result = new Integer[1];
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int j : arr) {
            if (countMap.containsKey(j)) {
                countMap.put(j, countMap.get(j) + 1);
            } else
                countMap.put(j, 1);
        }
        countMap.forEach((k, v) -> {
            if (v==1)
                result[0] = k;
        });
        return result[0];
    }
}
