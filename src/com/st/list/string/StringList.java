package com.st.list.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringList {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Satya", "Lalit", "Sid", "debu", "Liku", "Sid");
		
		//forEach
//		names.stream().forEach(x -> System.out.print(x +" "));
//		names.stream().forEach(System.out::print);
//		System.out.println();
//		names.parallelStream().forEach(x -> System.out.print(x +" "));
//		System.out.println();
//		names.parallelStream().forEachOrdered(x -> System.out.print(x +" "));
		
		// filer
//		names.stream().filter(s -> s.toLowerCase().startsWith("s")).forEach(s -> System.out.print(s + " "));
		
		// reduce
//		String reduce = names.stream().reduce((s1, s2) -> s1 + "-" + s2).get();
//		System.out.println(reduce);
		
		// join
//		String join = names.stream().collect(Collectors.joining("-"));
//		System.out.println(join);
		
		// map
//		names.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));
		
//		names.stream().map(String::toUpperCase).sorted().forEach(s -> System.out.print(s + " "));
//		System.out.println();
//		names.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
//		System.out.println();
//		names.stream().sorted((s1, s2) -> s1.length() > s2.length() ? 1 : s1.length() < s2.length() ? - 1 : 0 )
//			.forEach(s -> System.out.print(s + " "));
//		System.out.println();
//		names.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(s -> System.out.print(s + " "));
//		System.out.println();
//		names.stream().sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(s -> System.out.print(s + " "));
		
		
//		Map<String, Integer> mapString = names.stream().collect(Collectors.toMap(
//				s -> s.substring(0, 1),
//				s -> s.length(),
//				(old, newV) -> old
//			));
//		System.out.println(mapString);
		
		// count the length of String greater than certain value
//		long count = names.stream().filter(s -> s.length() >= 4).count();
//		System.out.println(count);
		
//		String word = "I am Sid";
//		long count = word.chars().count();
//		System.out.println(count);
		
		// remove duplicate
//		names.stream().distinct().forEach(s -> System.out.println(s + " "));
		
		// Group by length of a String
//		Map<Integer, List<String>> lengthGrB = names.stream().collect(Collectors.groupingBy(s -> s.length()));
//		System.out.println(lengthGrB);
		
		// GroupBy and Sort the value List also
//		Map<Integer, List<String>> lengthGrBValueSort = names.stream().collect(Collectors.groupingBy(
//				s -> s.length(),
//				Collectors.collectingAndThen(
//						Collectors.toList(),
//						list -> list.stream().sorted().collect(Collectors.toList())
//				)
//		));
//		System.out.println(lengthGrBValueSort);
		
		// FlattenMap
//		List<List<String>>
//		names.stream().flatMap(name -> Arrays.stream(name.split(","))).forEach(System.out::println);
		
		// find all the anagram
//		List<String> checkAnagrams = Arrays.asList("ate", "cat", "tea", "act", "eat", "bat");
//		Map<String, List<String>> collect = checkAnagrams.stream().collect(
//				Collectors.groupingBy(
//						s -> {
//							char ch[] = s.toCharArray();
//							Arrays.sort(ch);
//							return new String(ch);
//						},
//						Collectors.collectingAndThen(
//								Collectors.toList(), 
//								list -> list.stream().sorted().collect(Collectors.toList()))
//				)
//		);
//		System.out.println(collect);
		
		List<String> checkPallindrom = Arrays.asList("eat", "act", "tea", "act", "eat", "bat");
		Map<String, List<String>> collect = checkPallindrom.stream().collect(Collectors.groupingBy(s -> {
			return s;
		}));
		System.out.println(collect);
		
		String s1 = "I Love My   India";
		String []sArray = s1.split(" ");
		String rev = "";
		for (int i=sArray.length-1; i>=0; i--) {
			if(!sArray[i].equals(""))
				rev = rev + sArray[i].trim() + " ";
		}
		System.out.println(rev);

	}
}
