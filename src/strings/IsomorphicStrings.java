package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean isIsomorphic = checkIsomorphicStrings(s, t);
        System.out.println(isIsomorphic);
    }

    private static boolean checkIsomorphicStrings(String s, String t) {

        if (s.length() != t.length())
            return false;
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2)
                    return false;
            } else
                map1.put(c1, c2);

            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1)
                    return false;
            } else
                map2.put(c2, c1);
        }
        return true;
    }
}
