package strings;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "IceCreAm";
        //Approach 1: This is having more time complexity
        String vowelsReversed = reverseVowels(str);
        //Approach 2: This is having less time complexity
        String result = reverseVowelsUsingChar(str);
        System.out.println(result);
    }

    private static String reverseVowelsUsingChar(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        int i = 0;
        while (left < right) {
            while (left < right && !isVowel(ch[left])) left++;
            while (left < right && !isVowel(ch[right])) right--;
            if (left < right) {
                char c = ch[left];
                ch[left] = ch[right];
                ch[right] = c;
                left++;
                right--;
            }
        }
        return new String(ch);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    private static String reverseVowels(String str) {
        String[] words = str.split("");
        int[] arr = new int[words.length];
        int k = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("a") || words[i].equalsIgnoreCase("e") ||
                    words[i].equalsIgnoreCase("i") || words[i].equalsIgnoreCase("o") ||
                    words[i].equalsIgnoreCase("u")) {
                arr[k] = i;
                k++;
            }
        }

        for (int i = 0; i < k / 2; i++) {
            String s = words[arr[i]];
            words[arr[i]] = words[arr[k - i - 1]];
            words[arr[k - i - 1]] = s;
        }

        return String.join("", words);
    }
}
