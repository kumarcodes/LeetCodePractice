package strings;

public class LastWordString {
public static void main(String[] args) {
    String str = "Hello World  joyus   erewojiqvcvc         ";
    String result = "";
    String f = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) == ' ') {
            str = str.substring(0, i) + str.substring(i + 1);
        } else
            break;
    }

    for (int i = str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) != ' ') {
            result = result.concat(String.valueOf(str.charAt(i)));
        } else
            break;
    }
    for (int i = result.length() - 1; i >= 0; i--) {
        f = f.concat(String.valueOf(result.charAt(i)));
    }

    System.out.println(f);
}
}