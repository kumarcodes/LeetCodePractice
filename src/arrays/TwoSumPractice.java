package arrays;

public class TwoSumPractice {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 17, 19};
        int left = 0;
        int right = 1;
        int target = 34;
        while (left < right && left < arr.length && right < arr.length)
            if (arr[left] + arr[right] == target) {
                System.out.println(left + " " + right);
                System.exit(0);
            } else if (arr[left] + arr[right] < target) {
                left++;
                right++;
            } else {
                right--;
                left++;
            }
    }
}
