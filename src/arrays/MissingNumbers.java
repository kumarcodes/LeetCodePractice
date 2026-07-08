package arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int missingNumber = findMissingNumber(arr);
        System.out.println(missingNumber);
    }

    private static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int totalSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return totalSum - sum;
    }
}
