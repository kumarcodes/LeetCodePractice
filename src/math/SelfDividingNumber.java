package math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static void main(String[] args) {
        int left = 47;
        int right = 85;
        List<Integer> list = selfDividingNumbers(left, right);
        System.out.println(list);
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) {
                    break;
                }
                num /= 10;
            }
            if (num == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
