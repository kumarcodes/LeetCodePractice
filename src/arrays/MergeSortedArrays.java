package arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 0, 4, 2, 3, 5, 7};
        int[] arr2 = new int[]{19, 0, 41, 3, 7, 10, 1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int len = arr2.length + arr1.length;
        int[] arrfinal = new int[len];
        arrfinal = mergeArrays(arr1, arr2, len);
        System.out.println(Arrays.toString(arrfinal));
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2, int len) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] quarterfinal = new int[len];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])
                quarterfinal[k++] = arr1[i++];
            else
                quarterfinal[k++] = arr2[j++];
        }
        while (i < arr1.length)
            quarterfinal[k++] = arr1[i++];
        while (j < arr2.length)
            quarterfinal[k++] = arr2[j++];
        return quarterfinal;
    }
}