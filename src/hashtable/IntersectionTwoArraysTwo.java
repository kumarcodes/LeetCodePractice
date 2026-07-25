package hashtable;

import java.util.*;

public class IntersectionTwoArraysTwo {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5, 9};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersection(nums1, nums2);
        System.out.println(java.util.Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : nums1) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int i : nums2) {
            Integer count = countMap.get(i);
            if (count != null && count > 0) {
                result.add(i);
                countMap.put(i, count - 1);
            }
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
