package com.st.convert;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ConvertFromList {
    public static void main(String[] args) {
        List<String> list = List.of("L", "I", "S", "T");
        String[] arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        List<Integer> listOfInt = List.of(1, 2, 3);
        int[] arr1= listOfInt.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr1));

        Set<String> set = Set.of("S", "E", "T");
        String[] arr2 = set.toArray(new String[0]);
        System.out.println(Arrays.toString(arr2));

        // Java-11
        String[] arr3 = list.toArray(String[]::new);
        System.out.println(Arrays.toString(arr3));

        Collection<String> col = List.of("X", "Y");
        Object[] arr4 = col.toArray();
        System.out.println(Arrays.toString(arr4));

//        String[] keys = map.keySet().toArray(new String[0]);
//        Integer[] values = map.values().toArray(new Integer[0]);
    }
}
