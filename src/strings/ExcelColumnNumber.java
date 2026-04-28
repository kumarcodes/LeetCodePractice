package strings;

import java.util.HashMap;
import java.util.Map;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        String str = "ZY";
        int columnNumber = findColumnNumber(str); //Approach 1
        int columnNumberWithoutMap = findColumnNumberWithoutMap(str);
        System.out.println(columnNumber);
        System.out.println(columnNumberWithoutMap);
    }

    private static int findColumnNumberWithoutMap(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }

    //Approach 1
    private static int findColumnNumber(String str) {
        Map<Character, Integer> excelMap = new HashMap<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            excelMap.put(ch, ch - 'A' + 1);
        }
        if (str.length() == 1)
            return excelMap.get(str.charAt(0));
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = result * 26 + excelMap.get(str.charAt(i));
        }
        return result;
    }
}
