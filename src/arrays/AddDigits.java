package arrays;

public class AddDigits {
    public static void main(String[] args) {
        int num = 19;
        int sum = addDigits(num);
        System.out.println("Total Sum is: " + sum);
    }

    private static int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem;
            if (num == 0 && sum >= 10) {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
