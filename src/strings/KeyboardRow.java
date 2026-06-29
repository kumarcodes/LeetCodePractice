package strings;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);
        for (String word : result) {
            System.out.println(word);
        }
    }

    private static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";


        return java.util.Arrays.stream(words)
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
