package arrays;

/**
 * Solution to the Nim Game problem.
 * 
 * Problem: You are playing the following Nim Game with your friend. There is a pile of stones on the table.
 * In each turn, a player removes 1 to 3 stones from the pile. The player who removes the last stone wins.
 * Given n (the number of stones), determine if you can win the game if both you and your friend play optimally.
 * You always go first.
 * 
 * Solution Approach: Game Theory - The key insight is that if n is not divisible by 4, you can always win.
 * This is because you can always leave your opponent with a multiple of 4 stones.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class CanWinNim {
    public static void main(String[] args) {
        int n = 6;
        boolean isWinner = canWinNim(n);
        System.out.println(isWinner);
    }

    /**
     * Determines if the current player can win the Nim Game.
     * 
     * @param n the number of stones in the pile
     * @return true if the current player can win with optimal play, false otherwise
     */
    private static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
