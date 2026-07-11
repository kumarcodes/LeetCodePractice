package arrays;

public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = findMajorityElement(nums);
        System.out.println(result);
    }

    // Finds the majority element (appears more than n/2 times) using Boyer-Moore voting algorithm
    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Find potential candidate
        for (int num : nums) {
            if (count == 0)
                candidate = num;
            count = count + (candidate == num ? 1 : -1);
        }

        // Verify candidate is majority element
        int verifyCount = 0;
        for (int num : nums) {
            if (num == candidate)
                verifyCount++;
        }
        if (verifyCount > nums.length / 2) {
            return candidate;
        }
        return -1;
    }
}
