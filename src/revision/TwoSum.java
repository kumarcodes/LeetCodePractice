package revision;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 18;
        int[] result = findOutTwoSumIndices(arr, target);
        System.out.println(Arrays.toString(result));

    }

    private static int[] findOutTwoSumIndices(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}
