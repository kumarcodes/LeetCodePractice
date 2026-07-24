package hashtable;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersection(nums1, nums2);
        System.out.println(java.util.Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                result.add(i);
            }
        }
        int[] intersection = new int[result.size()];
        int index = 0;
        for (int value : result) {
            intersection[index++] = value;
        }
        return intersection;
    }
}
