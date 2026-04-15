package arrays;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 5, 4, 5, 6, 7, 6, 9, 9};
        int k = 5;
        int result = removeGivenElement(k, arr);
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeGivenElement(int k, int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                arr[temp] = arr[i];
                temp++;
            }
        }
        return temp;
    }
}
