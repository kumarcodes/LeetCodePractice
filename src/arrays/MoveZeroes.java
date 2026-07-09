/*
 * Question: Move Zeroes
 * Problem: Given an integer array, move all zeroes to the end while maintaining
 * the relative order of non-zero elements.
 *
 * Constraints:
 * - In-place modification preferred
 * - Must not copy the array to a new one
 *
 * Example: [4,2,4,0,0,3,0,5,1,0] => [4,2,4,3,5,1,0,0,0,0]
 *
 * Approach: Two-pointer technique
 * - left pointer tracks the position to place next non-zero element
 * - right pointer scans through the array
 * - Swap when left is 0 and right is non-zero
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        int[] result = moveAllZeroes(arr);
        int[] result1 = moveAllZeroesUsingStreams(arr);
        for (int num : result) {
            System.out.println(num);
        }
    }

    private static int[] moveAllZeroes(int[] arr) {
        int left = 0;
        int right = 1;
        while (right < arr.length) {
            if (arr[left] == 0 && arr[right] != 0) {
                arr[left] = arr[right];
                arr[right] = 0;
                left++;
                right++;
            } else if (arr[left] == 0 && arr[right] == 0) {
                right++;
            } else {
                left++;
                right++;
            }

        }
        return arr;
    }

    private static int[] moveAllZeroesUsingStreams(int[] arr) {
        int[] res = Arrays.stream(arr).filter(x -> x != 0).toArray();
        IntStream.range(0, arr.length).forEach(i -> arr[i] = i < res.length ? res[i] : 0);
        return arr;
    }
}
