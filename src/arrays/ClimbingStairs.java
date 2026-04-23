package arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        int result = countCombination(n);
        System.out.println(result);
    }

    private static int countCombination(int n) {
        int prev = 1;
        int next = 2;
        if (n <= 2)
            return n;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }
}
