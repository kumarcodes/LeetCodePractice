package math;

import java.util.Arrays;

public class MaxProductThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4};
        int max = calculateMaxProduct(arr);
        System.out.println(max);
    }

    private static int calculateMaxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j >= max) {
                thirdMax = secondMax;
                secondMax = max;
                max = j;
            } else if (j >= secondMax) {
                thirdMax = secondMax;
                secondMax = j;
            } else if (j >= thirdMax) {
                thirdMax = j;
            }
            if (j <= lowest) {
                secondLowest = lowest;
                lowest = j;
            } else if (j <= secondLowest) {
                secondLowest = j;
            }


        }
        return Math.max(max * secondMax * thirdMax, max * lowest * secondLowest);
    }
}
