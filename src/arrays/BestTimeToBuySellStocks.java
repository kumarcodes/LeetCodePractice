package arrays;

public class BestTimeToBuySellStocks {
    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        int result = findHighestProfit(arr);
        System.out.println(result);
    }

    private static int findHighestProfit(int[] arr) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int c1 = 0;
        int c2 = 1;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i] && c1 < c2) {
                min = arr[i];
                c1++;
            }
            if (i > 0 && max < arr[i] && c1 < c2) {
                max = arr[i];
                c2++;
            }
        }
        return max - min;
    }
}
