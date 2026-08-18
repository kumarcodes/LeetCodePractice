package hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LuckInteger {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        int num = luckIntegerFinder(arr);
        System.out.println(num);
    }

    private static int luckIntegerFinder(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (Objects.equals(entry.getKey(), entry.getValue()))
                return entry.getKey();

        }

        System.out.println(countMap);

        return -1;
    }
}
