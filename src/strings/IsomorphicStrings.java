package strings;

import java.util.Arrays;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        boolean isIsomorphic = checkIsomorphicStrings(s, t);
        System.out.println(isIsomorphic);
    }

    private static boolean checkIsomorphicStrings(String s, String t) {
        if (s.length() != t.length())
            return false;
        int count1 = 0;
        int count2 = 0;
        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        String s1 = new String(arr1);
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        String t1 = new String(arr2);
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) != s1.charAt(i + 1)) {
                count1++;
            }
            if (t1.charAt(i) != t1.charAt(i + 1)) {
                count2++;
            }
        }
        return count2 == count1;
    }
}
