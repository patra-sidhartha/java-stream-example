package com.st.convert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertToList {
    public static void main(String[] args) {
//        Arrays.asList() → fixed size

        int[] arr = {10, 20,30, 10, 40};
//        List<Integer> list = Arrays.asList(arr); // This creates List<int[]>, not List<Integer>
        Integer[] integers = {10, 20,30, 10, 40};
        List<Integer> integersList = Arrays.asList(integers); // For Wrapper class Object we use asList()
        System.out.println("integersList:" + integersList);

//        List.of() → immutable
        List<Integer> immutableList  = List.of(integers);
//        immutableList.add(250); // Exception: due ImmutableCollections
        System.out.println("immutableList:" + immutableList);

//        Why boxed() is needed?
//        Streams over primitive arrays produce IntStream, not Stream<Integer>

//        Streams are clean but slightly slower
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.add(150);
        System.out.println(list);

        List<Integer> list1 = Arrays.stream(arr).boxed().toList(); // Returned list is immutable
        System.out.println(list1);

        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(set);  // Not Indexed based

        String[] alphabets = {"A", "B", "C"};
        List<String> strings= Arrays.asList(alphabets);
        System.out.println(strings);

        List<String> stringList = Arrays.stream(alphabets).collect(Collectors.toList());
        System.out.println(stringList);

        Set<String> stringSet = new HashSet<>(Arrays.asList(alphabets));
        System.out.println(stringSet);



    }
}
