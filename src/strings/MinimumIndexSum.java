package strings;

import java.util.ArrayList;
import java.util.List;

public class MinimumIndexSum {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list2[j].equals(list1[i])) {
                    list.add(List.of(i, j));
                }
            }
        }
        int max = list.stream()
                .mapToInt(innerList -> innerList.stream()
                        .mapToInt(Integer::intValue)
                        .sum())
                .min()
                .orElse(0);
        System.out.println(list);
        System.out.println(max);

    }
}
