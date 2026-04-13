package arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        Integer result = RomanToIntegerConverterUsingMap(str);
        Integer resultUsingSwitch = RomanToIntegerConverterUsingSwitch(str);
        System.out.println("Solution using Map " + result);
        System.out.println("Solution using Switch Case " + resultUsingSwitch);
    }

    //This solution has High Overhead
    private static Integer RomanToIntegerConverterUsingMap(String str) {
        int result = 0;
        Map<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);

        for (int i = 0; i < str.length() - 1; i++) {
            int current = symbolMap.get(str.charAt(i));
            int next = symbolMap.get(str.charAt(i + 1));
            if (current >= next) {
                result = result + current;

            } else {
                result = result - current;
            }
        }
        result = result + symbolMap.get(str.charAt(str.length() - 1));
        return result;

    }

    //This is more fast
    private static Integer RomanToIntegerConverterUsingSwitch(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int current = getValue(str.charAt(i));
            int next = getValue(str.charAt(i + 1));
            if (current >= next)
                result = result + current;
            else
                result = result - current;
        }
        result = result + getValue(str.charAt(str.length() - 1));
        return result;

    }

    private static int getValue(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
