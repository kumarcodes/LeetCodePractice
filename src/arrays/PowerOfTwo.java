package arrays;

/*
 * Question:
 * Given an integer n, return true if it is a power of two.
 * A power of two means there exists an integer x such that n == 2^x.
 *
 * Examples:
 * n = 1   -> true
 * n = 16  -> true
 * n = 18  -> false
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 32;
        boolean isPowerOfTwo = checkPowerOfTwo(num);
        boolean isPowerOfTwoWithBitManupulation = checkPowerOfTwoBitManupulation(num);

        System.out.println("Number: " + num);
        System.out.println("Using division: " + isPowerOfTwo);
        System.out.println("Using bit manipulation: " + isPowerOfTwoWithBitManupulation);
    }

    // Checks whether a number is a power of two using bit manipulation.
    private static boolean checkPowerOfTwoBitManupulation(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    // Checks whether a number is a power of two by repeatedly dividing by 2.
    private static boolean checkPowerOfTwo(int num) {
        if (num <= 0)
            return false;
        while (num % 4 == 0) {
            num = num / 4;
        }
        return num == 1;
    }
}
