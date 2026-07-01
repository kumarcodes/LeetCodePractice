package strings;

public class BaseSeven {
    public static void main(String[] args) {
        int n = 7;
        String str = findBaseSevenValue(n);
        System.out.println(str);
    }

    private static String findBaseSevenValue(int n) {
        if (n == 0) return "0";
        String result = "";
        boolean isNegative = false;
        StringBuilder stringBuilder = new StringBuilder(result);
        if (n < 0) {
            n = Math.abs(n);
            isNegative = true;
        }
        while (n > 0) {
            int rem = n % 7;
            stringBuilder = stringBuilder.append(rem);
            n = n / 7;
        }
        if (isNegative)
            stringBuilder.append("-");
        return stringBuilder.reverse().toString();
    }
}
