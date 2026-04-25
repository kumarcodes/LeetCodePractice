package strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "0P";
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isValidPalindrome = checkPalindrome(str);
        System.out.println(isValidPalindrome);
    }

    private static boolean checkPalindrome(String str) {

        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }
}
