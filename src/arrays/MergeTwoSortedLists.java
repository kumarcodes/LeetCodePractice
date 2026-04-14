package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(2,7,11,17);
        List<Integer> finalList = Stream.concat(list1.stream(),list2.stream())
                                  .sorted(Comparator.reverseOrder()).toList();
        System.out.println(finalList);
    }
}
