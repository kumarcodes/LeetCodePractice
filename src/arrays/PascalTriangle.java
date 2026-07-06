package arrays;

import java.util.*;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRowList = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row)
                    currentRowList.add(1);
                else {
                    int valAbove = resultList.get(row - 1).get(col - 1);
                    int valDiagonalAbove = resultList.get(row - 1).get(col);
                    currentRowList.add(valAbove + valDiagonalAbove);
                }
            }
            resultList.add(currentRowList);
        }
        return resultList;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }
}
