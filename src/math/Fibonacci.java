package math;

public class Fibonacci {
    public static void main(String[] args) {
        int termPosition = 10;
        int fibonacciValue = getFibonacciValue(termPosition);
        System.out.println(fibonacciValue);
    }

    private static int getFibonacciValue(int termPosition) {
        if (termPosition <= 1) {
            return termPosition;
        }

        int previousValue = 0;
        int currentValue = 1;

        for (int index = 2; index <= termPosition; index++) {
            int nextValue = previousValue + currentValue;
            previousValue = currentValue;
            currentValue = nextValue;
        }

        return currentValue;
    }
}
