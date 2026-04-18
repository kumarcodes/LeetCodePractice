package arrays;

public class MirrorDistanceInteger {
    public static void main(String[] args) {
        int input = 70;
        int diff = calculateMirrorDistance(input);
        System.out.println(diff);
    }

    private static int calculateMirrorDistance(int input) {
        int inputStored = input;
        int reverse = 0;
        int rem;
        while (input > 0) {
            rem = input % 10;
            reverse = reverse * 10 + rem;
            input = input / 10;
        }
        return Math.abs(inputStored - reverse);
    }
}
