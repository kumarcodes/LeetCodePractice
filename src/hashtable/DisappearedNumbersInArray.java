package hashtable;

import java.util.*;

public class DisappearedNumbersInArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        //Approach 1 brute force
        int[] res = disappearedNumbers(nums);
        System.out.println(Arrays.toString(res));
        //Approach 2 Better Time Complexity
        List<Integer> list = disappearedNumbersWithoutMap(nums);
        System.out.println(list);
    }

    private static int[] disappearedNumbers(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : nums) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!countMap.containsKey(i + 1)) {
                list.add(i + 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static List<Integer> disappearedNumbersWithoutMap(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] - 1] = nums[i];
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}