package com.st.intStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class LongStreamExample {
    public static void main(String[] args) {
        long[] arr = {10L, 20L, 30L};
        LongStream stream = Arrays.stream(arr);

        LongStream.of(1L, 2L, 3L);

        LongStream.range(1L, 5L);        // 1,2,3,4
        LongStream.rangeClosed(1L, 5L);  // 1..5

        long sum = LongStream.rangeClosed(1, 1_000_000).sum();

        long max = LongStream.of(5, 2, 9).max().getAsLong();
        long min = LongStream.of(5, 2, 9).min().getAsLong();
        double avg = LongStream.of(2, 4, 6).average().getAsDouble();

        long[] arr1 = LongStream.range(1, 4).toArray();
        List<Long> list = LongStream.range(1, 4)
                .boxed()
                .toList();

//        DoubleStream
    }
}
