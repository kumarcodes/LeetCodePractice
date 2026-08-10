package hashtable;

public class JewelsStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int count = calculateJewels(jewels, stones);

        System.out.println(count);
    }

    private static int calculateJewels(String jewels, String stones) {
        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }
        return count;
    }
}
