package arrays;

/**
 * BestTimeToBuySellStocks
 *
 * Example program that computes the maximum profit from a single buy-sell
 * transaction given an array of daily stock prices.
 *
 * Algorithm:
 * - Track the minimum price seen so far (min).
 * - For each price, compute potential profit = price - min.
 * - Update maxProfit when a larger profit is found.
 * - Update min when a new lower price is found.
 * Time complexity: O(n), Space complexity: O(1).
 */
public class BestTimeToBuySellStocks {
    public static void main(String[] args) {
        // Example usage: prices for consecutive days
        int[] arr = {2, 4, 1};
        int result = findHighestProfit(arr);
        System.out.println(result); // prints maximum profit (should be 2 for this input)
    }

    /**
     * Finds the highest profit obtainable from a single buy-sell.
     *
     * @param arr array of stock prices where arr[i] is the price on day i
     * @return maximum profit (0 if no profit is possible)
     */
    private static int findHighestProfit(int[] arr) {
        if (arr == null || arr.length < 2) {
            // Not enough prices to make a transaction
            return 0;
        }

        int min = arr[0];       // lowest price seen so far (best day to buy)
        int maxProfit = 0;     // best profit seen so far

        // Start from day 1 because day 0 is used to initialize min
        for (int i = 1; i < arr.length; i++) {
            int profitToday = arr[i] - min;    // profit if sold today after buying at 'min'
            if (profitToday > maxProfit) {
                maxProfit = profitToday;      // update best profit
            }
            if (arr[i] < min) {
                min = arr[i];                 // found a new lower buying price
            }
        }
        return maxProfit;
    }
}
