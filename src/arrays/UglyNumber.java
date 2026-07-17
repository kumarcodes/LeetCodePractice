package arrays;

public class UglyNumber {
    public static void main(String[] args) {
        int num = 7;
        boolean checkUglyNumber = uglyNumberChecker(num);
        System.out.println(checkUglyNumber);
    }

    private static boolean uglyNumberChecker(int num) {
        if (num < 0)
            return false;
        if (num == 1)
            return true;
        if (num % 2 == 0) {
            num = num / 2;
        }
        if (num % 3 == 0) {
            num = num / 3;
        }
        if (num % 5 == 0) {
            num = num / 5;
        }
        if (num == 1)
            return true;
        return false;
    }
}
