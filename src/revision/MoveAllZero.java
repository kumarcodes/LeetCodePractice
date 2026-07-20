package revision;

import java.util.Arrays;

public class MoveAllZero {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 0, 3, 12};
        moveAllZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveAllZeroes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[count] = temp;
                arr[i] = 0;
                count++;
            }
        }
    }
}
