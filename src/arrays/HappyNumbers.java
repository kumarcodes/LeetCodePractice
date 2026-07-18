package arrays;

public class HappyNumbers {
    public static void main(String[] args) {
        int num = 3;
        boolean isHappyNumber = checkHappyNumber(num);
        System.out.println(isHappyNumber);
    }

    private static boolean checkHappyNumber(int num) {
        int temp;
        int sum;
        while (num != 1 && num != 4) {
            sum = 0;
            while (num != 0) {
                temp = num % 10;
                sum = sum + temp * temp;
                num = num / 10;
            }
            num = sum;

        }
        return num == 1;
    }
}
