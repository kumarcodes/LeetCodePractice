package hashtable;

import java.util.*;

public class UncommonWords {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] uncommonWords = findUncommonWords(s1, s2);
        System.out.println("Uncommon words: " + Arrays.toString(uncommonWords));
    }

    private static String[] findUncommonWords(String s1, String s2) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        // Count occurrences of each word in both strings
        for (String s : s1.split(" ")) {
            wordCountMap.put(s, wordCountMap.getOrDefault(s, 0) + 1);
        }
        for (String s : s2.split(" ")) {
            wordCountMap.put(s, wordCountMap.getOrDefault(s, 0) + 1);
        }
        // Find words that appear exactly once
        List<String> uncommonWordsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWordsList.add(entry.getKey());
            }
        }
        return uncommonWordsList.toArray(new String[0]);
    }
}
