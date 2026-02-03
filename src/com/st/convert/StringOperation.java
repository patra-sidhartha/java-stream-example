package com.st.convert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringOperation {
    public static void main(String[] args) {
        String s = "hello";
        IntStream chars = s.chars();   // stream of ASCII/Unicode values

//        Convert to characters
        List<Character> list = s.chars().mapToObj(c -> (char) c).toList();
        System.out.println(list);

//        Stream of Words from a String
        String sentence = "Java streams are powerful";
        List<String> words = Arrays.stream(sentence.split(" "))
                .toList();
        System.out.println(words);

//        Common String Stream Use-Cases

//        Count vowels
        long count = s.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
        System.out.println("count:" + count);

//        Reverse a String
        String reversed = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        lst -> {
                            Collections.reverse(lst);
                            return lst.stream();
                        }))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("reversed:" + reversed);

//        Remove duplicates
        String result = s.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(result);


    }
}
