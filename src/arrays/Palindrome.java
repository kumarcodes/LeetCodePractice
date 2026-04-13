package arrays;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean result = isPalindrome(x);
        System.out.println(result);

    }

    private static boolean isPalindrome(int x) {
        int rem = 0;
        int reverse = 0;
        int y = x;
        if (y >= 0) {

            while (y > 0) {
                rem = y % 10;
                y = y / 10;
                reverse = reverse * 10 + rem;
            }
            return reverse == x;
        }
        return false;
    }
}
