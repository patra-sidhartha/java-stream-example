package com.st.list.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxFuncDiffInputUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,10 ,60,30,50,40);

//        int max = list.stream().max((i1, i2) -> i1>i2 ? 1 : i1<i2 ? -1 : 0).get();

//        int max = list.stream().max(Comparator.comparingInt(Integer::intValue)).get();

//        int max = list.stream().max(Comparator.comparingInt(x -> (int) x)).get();

//        int max = list.stream().max(Comparator.comparingInt(x -> x)).get();

//        int max = list.stream().max(Integer::compareTo).get();

//        int max = list.stream().max(Integer::compareTo).orElseThrow();

//        int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow(() -> new RuntimeException("List is Empty"));

        int max = list.stream().max(new MyComparator()).get();
        System.out.println(max);

    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 > o2 ? 1 : o1<o2 ? -1 : 0;
    }
}