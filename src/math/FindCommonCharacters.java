package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        List<String> commonChars = findCommonCharacters(words);
        System.out.println(commonChars);
    }

    private static List<String> findCommonCharacters(String[] words) {

        int[] common = new int[26];
        Arrays.fill(common, Integer.MAX_VALUE);
        for (String word : words) {
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                common[i] = Math.min(common[i], count[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < common[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        return result;
    }
}
