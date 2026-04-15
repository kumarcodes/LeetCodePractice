package arrays;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 5, 4, 5, 6, 7, 6, 9};
        int k=5;
        int temp = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=k){
                arr[temp] = arr[i];
                temp++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
