package strings;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Map<Integer, Character> characterIntegerMap = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            characterIntegerMap.put(i, (char) ('A' + i - 1));
        }
        int input = 1;
        String result = calculateColumnTitle(input, characterIntegerMap);
        System.out.println(result);
    }

    private static String calculateColumnTitle(int input, Map<Integer, Character> characterIntegerMap) {

        StringBuilder result = new StringBuilder();
        while (input > 0) {
            input--;
            int remainder = input % 26;
            result.append(characterIntegerMap.get(remainder + 1));
            input = input / 26;

        }
        return result.reverse().toString();
    }
}
