package hashtable;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        distributeCandies(arr);
    }

    private static void distributeCandies(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int len = arr.length / 2;
        if (set.size() >= len)
            System.out.println(len);
        else
            System.out.println(set.size());
    }
}
