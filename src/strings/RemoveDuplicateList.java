package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        List<Integer> sortedList = removeDuplicatesFromList(integerList);
        System.out.println(sortedList);
    }

    private static List<Integer> removeDuplicatesFromList(List<Integer> integerList) {
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < integerList.size() - 1; i++) {
            if (integerList.get(i) != integerList.get(i + 1)) {
                sortedList.add(integerList.get(i));
            }
        }
        sortedList.add(integerList.getLast());
        return sortedList;
    }
}
