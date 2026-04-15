package strings;

public class FirstOccurenceString {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        int index = stringChecker(haystack, needle);
        System.out.println(index);
    }

    private static int stringChecker(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i)==needle.charAt(0) && (i+needle.length()<=haystack.length())) {
                String checker = haystack.substring(i, i + needle.length());
                if (checker.equals(needle))
                    return i;
            }

        }
        return -1;
    }
}
