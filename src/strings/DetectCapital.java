package strings;
//define the usage of capitals in a word to be right when one of the following cases holds:
//
//All letters in this word are capitals, like "USA".
//All letters in this word are not capitals, like "leetcode".
//Only the first letter in this word is capital, like "Google".
//Given a string word, return true if the usage of capitals in it is right.
public class DetectCapital {
    public static void main(String[] args) {
        String str = "Leetcode";
        boolean isAllCaps = checkIsAllCaps(str);
        System.out.println(isAllCaps);
    }

    private static boolean checkIsAllCaps(String str) {
        String compareLower = str.toLowerCase();
        String compare = str.toUpperCase();
        String compareExceptFirstChar = str.substring(1,str.length()).toLowerCase();
        if (compare.equals(str)||compareLower.equals(str)||compareExceptFirstChar.equals(str.substring(1,str.length())))
            return true;
        return false;
    }
}
