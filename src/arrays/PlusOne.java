package arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 9, 9};
        System.out.println(Arrays.toString(convertPlusOne(arr)));
    }

    private static int[] convertPlusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i] + 1;
                return arr;
            } else
                arr[i] = 0;
        }
        int[] res = new int[arr.length + 1];
        res[0] = 1;
        return res;
    }
}
