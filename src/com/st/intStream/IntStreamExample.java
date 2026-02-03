package com.st.intStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
//        How to Create an IntStream
//        From an int[]
        int[] arr2 = {1, 2, 3};
        IntStream stream1 = Arrays.stream(arr2);

//        Common Operations
//        Using IntStream.of()
        IntStream stream = IntStream.of(1, 2, 3);

//        Range (Very Common)
        IntStream.range(1, 5);        // 1,2,3,4
        IntStream.rangeClosed(1, 5);  // 1,2,3,4,5
        System.out.println("============");

//        Generate / Iterate
        IntStream.iterate(0, i -> i + 2).limit(5).forEach(System.out::println);
        System.out.println("===============");
        IntStream.generate(() -> 5).limit(3).forEach(System.out::println);
        System.out.println("===============");

//        Filter
        IntStream.range(1, 10)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


//        map
        IntStream.range(1, 5).map(n -> n * n).forEach(System.out::println);

//        Sum / Max / Min / Avg
        int sum = IntStream.range(1, 5).sum();
        int max = IntStream.of(3, 7, 2).max().getAsInt();
        double avg = IntStream.of(1, 2, 3).average().getAsDouble();
        System.out.println(sum + ":" + max + ":" + avg);

//        Convert IntStream

//        int[]
        int[] arr = IntStream.range(1, 5).toArray();
        System.out.println(Arrays.toString(arr));

//        Stream<Integer> (Boxing)
        List<Integer> list = IntStream.range(1, 5).boxed().toList();
        System.out.println(list);

//        map() vs mapToObj()
        IntStream.range(1, 4)
                .mapToObj(n -> "Num-" + n)
                .forEach(System.out::println);

//        Real Interview Example
//        Sum of even numbers from 1 to 100
        int sum1 = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println(sum1);

    }
}
