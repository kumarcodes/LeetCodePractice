package strings;

import java.util.*;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        //Java 8 Approach
        String[] result = findWords(words);
        //HashMap Approach
        String[] result1 = findWordsUsingMap(words);
        //ASCII Approach
        String[] result2 = findWordsUsingASCII(words);
        for (String word : result2) {
            System.out.println(word);
        }
    }

    private static String[] findWordsUsingASCII(String[] words) {
        List<String> list = new ArrayList<>();
        int[] rowOf = new int[26];
        for (char c : "qwertyuiop".toCharArray()) rowOf[c - 'a'] = 1;
        for (char c : "asdfghjkl".toCharArray()) rowOf[c - 'a'] = 2;
        for (char c : "zxcvbnm".toCharArray()) rowOf[c - 'a'] = 3;
        for (String word : words) {
            Integer targetRow = 0;
            boolean valid = true;
            for (int i = 0; i < word.length(); i++) {
                Character ch = Character.toLowerCase(word.charAt(i));
                Integer currentRow = rowOf[ch - 'a'];
                if (targetRow == 0) {
                    targetRow = currentRow;
                } else if (targetRow != currentRow) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                list.add(word);
        }
        return list.toArray(new String[0]);
    }

    private static String[] findWordsUsingMap(String[] words) {
        List<String> result = new ArrayList<>();

        Map<Character, Integer> row1 = new HashMap<>();
        for (char c : "qwertyuiop".toCharArray()) row1.put(c, 1);

        Map<Character, Integer> row2 = new HashMap<>();
        for (char c : "asdfghjkl".toCharArray()) row2.put(c, 2);

        Map<Character, Integer> row3 = new HashMap<>();
        for (char c : "zxcvbnm".toCharArray()) row3.put(c, 3);
        for (String word : words) {
            boolean valid = true;
            Integer targetRow = null;
            for (int i = 0; i < word.length(); i++) {
                char c = Character.toLowerCase(word.charAt(i));
                Integer currentRow = null;
                if (row1.containsKey(c)) {
                    currentRow = row1.get(c);
                } else if (row2.containsKey(c)) {
                    currentRow = row2.get(c);
                } else if (row3.containsKey(c)) {
                    currentRow = row3.get(c);
                }
                if (currentRow == null) {
                    valid = false;
                    break;
                }
                if (targetRow == null) {
                    targetRow = currentRow;
                }
                if (!currentRow.equals(targetRow)) {
                    valid = false;
                    break;
                }

            }
            if (valid) {
                result.add(word);
            }

        }
        return result.toArray(new String[0]);
    }

    private static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";


        return Arrays.stream(words)
                .filter(word -> {
                    String lowerCaseWord = word.toLowerCase();
                    boolean inRow1 = lowerCaseWord.chars().allMatch(c -> row1.indexOf(c) >= 0);
                    boolean inRow2 = lowerCaseWord.chars().allMatch(c -> row2.indexOf(c) >= 0);
                    boolean inRow3 = lowerCaseWord.chars().allMatch(c -> row3.indexOf(c) >= 0);
                    return inRow1 || inRow2 || inRow3;
                })
                .toArray(String[]::new);
    }
}
