package com.st.list.max;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxUsingCollection {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 2, 9, 5);

//        int max = list.get(0);
//        for (int num : list) {
//            if (num > max) {
//                max = num;
//            }
//        }

//        int max = Collections.max(list);

        int max = Collections.max(list, Integer::compareTo);

//        int min = Collections.max(list, Comparator.reverseOrder());

        System.out.println(max); // Output: 9
    }
}
