package strings;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("flower", "float", "flamingo");
        String result = findLongestCommonPrefix(stringList);
        System.out.println(result);
    }

    private static String findLongestCommonPrefix(List<String> stringList) {
        String first = stringList.getFirst();

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (String str : stringList) {
                if (i >= str.length() || str.charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
