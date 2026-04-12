package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices using brute force: " + result[0] + ", " + result[1]);

        int[] resultUsingMap = twoSumUsingHashMap(nums, target);

        System.out.println("Indices using HashMap: " + resultUsingMap[0] + ", " + resultUsingMap[1]);

    }

    //1. Brute Force Approach
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{-1, -1};
    }

    //2. Optimized Hashmap approach
    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> twoSumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (twoSumMap.containsKey(complement)) {
                return new int[]{twoSumMap.get(complement), i};
            } else {
                twoSumMap.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}