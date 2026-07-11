package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        boolean containsDuplicate = isDuplicatePresent(arr);
        boolean containsDuplicate1 = isDuplicatePresentUsingStreams(arr);
        System.out.println(containsDuplicate);
        System.out.println(containsDuplicate1);
    }

    private static boolean isDuplicatePresentUsingStreams(int[] arr) {
        return Arrays.stream(arr).distinct().count() != arr.length;
    }

    private static boolean isDuplicatePresent(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
