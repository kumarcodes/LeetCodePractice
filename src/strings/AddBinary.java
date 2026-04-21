package strings;

public class AddBinary {
    public static void main(String[] args) {
        String str1 = "1010";
        String str2 = "1010";
        String result = addBinaryNumbers(str1, str2);
        System.out.println(result);
    }

    private static String addBinaryNumbers(String str1, String str2) {
        int num1 = Integer.parseInt(str1, 2);
        int num2 = Integer.parseInt(str2, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
        git commit --amend --date="1 days ago"

    }
}
