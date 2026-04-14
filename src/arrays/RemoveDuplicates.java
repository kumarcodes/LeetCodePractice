package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2, 2, 3, 4, 5, 5};
        int k = removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int unique = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[unique] = arr[i];
                unique++;
            }
        }
        return unique;
    }
}
