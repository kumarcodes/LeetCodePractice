package strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaraa";
        boolean isAnagram = checkAnagram(s1, s2);
        System.out.println(isAnagram);
    }

    private static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        Map<Character, Integer> countMap1 = new HashMap<>();
        Map<Character, Integer> countMap2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            Character ch1 = s1.charAt(i);
            Character ch2 = s2.charAt(i);
            if (countMap1.containsKey(ch1))
                countMap1.put(ch1, countMap1.get(ch1) + 1);
            else
                countMap1.put(ch1, 1);
            if (countMap2.containsKey(ch2))
                countMap2.put(ch2, countMap2.get(ch2) + 1);
            else
                countMap2.put(ch2, 1);
        }
        return countMap1.equals(countMap2);
    }
}
