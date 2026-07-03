package strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceEachWord {
    public static void main(String[] args) {
        String str = "Java Java Spring Spring Java";
        Map<String, Long> countMap = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        for (Map.Entry<String, Long> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
