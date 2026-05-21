package strings;

import java.util.HashMap;
import java.util.Map;

/*
 Problem Statement:
 Given a pattern and a string s, determine if s follows the same pattern.

 Rules:
 - Each character in the pattern maps to exactly one word.
 - No two characters can map to the same word.
 - The mapping must be consistent throughout the string.

 Example:
 Input:
 pattern = "abba"
 s = "dog cat cat dog"

 Output:
 true

 Explanation:
 a -> dog
 b -> cat
 Pattern is followed correctly.
*/

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean isWordPattern = checkWordPattern(pattern, s);
        System.out.println(isWordPattern);
    }

    private static boolean checkWordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            Character ch = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word))
                    return false;
            } else {
                if (reverseMap.containsKey(word))
                    return false;
                map.put(ch, word);
                reverseMap.put(word, ch);

            }
        }
        return true;
    }
}
