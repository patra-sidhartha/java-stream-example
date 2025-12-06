package com.st.list.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntergerList {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Construct
		List<Integer> numbers = Arrays.asList(40,10,30,20,10,50);
		
		//forEach
//		numbers.stream().forEach(x -> {
//			System.out.println(x);
//		});
		
//		numbers.stream().forEach(System.out::println);
		
		// parallelStream
//		numbers.parallelStream().forEach(System.out::println);
		
		// Sort (accending)
//		numbers.stream().sorted((i1, i2) -> i1>i2 ? 1 : i1<i2? -1 : 0 ).forEach(System.out::println);
//		numbers.stream().sorted().forEach(System.out::println);
		
		// Sort (desccending)
//		numbers.stream().sorted((i1, i2) -> i1>i2 ? -1 : i1<i2 ? 1 : 0).forEach(System.out::println);
//		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		//reduce
//		Optional<Integer> reduce = numbers.stream().reduce((a,b) -> a + b);
//		if(reduce.isPresent()) System.out.println(reduce.get());
		
//		Integer reduce2 = numbers.stream().reduce(50, (a, b) -> a + b);
//		System.out.println(reduce2);
		
		//map
//		numbers.stream().map(x -> x + 5).forEach(System.out::println);
		
		// filter - map
//		numbers.stream().filter(x -> x>30).map(x -> x + 5).forEach(System.out::println);
		
		// max
//		Optional<Integer> max = numbers.stream().max((i1, i2) -> i1>i2?1 : i1<i2? -1 : 0);
//		if(max.isPresent())  System.out.println(max.get());
		
		
//		Optional<Integer> max = numbers.stream().max(Comparator.comparingInt(Integer::intValue));
//		if(max.isPresent())  System.out.println(max.get());
		
		// min
//		Optional<Integer> min = numbers.stream().min((i1, i2) -> i1>i2 ? 1 : i1<i2 ? -1: 0);
//		if(min.isPresent()) System.out.println(min.get());
		
//		Optional<Integer> min = numbers.stream().min(Comparator.comparingInt(Integer::intValue));
//		if(min.isPresent())  System.out.println(min.get());
		
		// average
//		double avg = numbers.stream().mapToDouble(Integer::intValue).average().getAsDouble();
//		System.out.println(avg);
		
		// sorted with limit
//		Stream<Integer> limit = numbers.stream().sorted().limit(2);
//		limit.forEach(System.out::println);
		
		// distinct
//		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect);
		
		//distict with sort
//		Stream<Integer> sorted = numbers.stream().distinct().sorted(Comparator.reverseOrder());
//		sorted.forEach(System.out::println);
		
		// 2nd highest number
//		Optional<Integer> first = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//		System.out.println(first.get());
		
		// IntSummaryStatistics
//		IntSummaryStatistics intSummaryStatistics = numbers.stream().collect(
//				IntSummaryStatistics::new,         // Supplier: creates a new IntSummaryStatistics
//			    IntSummaryStatistics::accept,      // Accumulator: adds an int to the statistics
//			    IntSummaryStatistics::combine      // Combiner: merges two IntSummaryStatistics objects
//				);
//		System.out.println(intSummaryStatistics.getAverage());
//		System.out.println(intSummaryStatistics.getMin());
//		System.out.println(intSummaryStatistics.getMax());
//		System.out.println(intSummaryStatistics.getSum());
//		System.out.println(intSummaryStatistics.getCount());

		// anyMatch, allMatch, noneMatch
//		boolean anyMatch = numbers.stream().anyMatch(x -> x>30);
//		System.out.println(anyMatch);
//		
//		boolean allMatch = numbers.stream().allMatch(x -> x%2==0);
//		System.out.println(allMatch);
		
		
		
//		List<Integer> list1 = Arrays.asList(4,10,3,5,8);
//		List<Integer> list1 = new ArrayList<>();
//		list1.addAll(Arrays.asList(4, 5, 6));
//		List<Integer> list2 = Arrays.asList(2,7,9,1,6);
//		
//		// combined 2 list
//		// Below will throw as Exception in thread "main" java.lang.UnsupportedOperationException as both should be ArrayList
//		list1.addAll(list2);
//		System.out.println(list1);
		
		
//		List<String> list3 =  new ArrayList<>();
//		list3.add("abc");
//		list3.add("xyz");
//		List<String> list4 = List.of("mno", "pqr");
//		list3.addAll(list4);
//		System.out.println(list3);
		
		// flatMap
//		 List<List<Integer>> nestedList = Arrays.asList(
//		            Arrays.asList(30,40), 
//		            Arrays.asList(50, 10) 
//		        );
//		nestedList.stream().flatMap(List::stream).forEach(System.out::println);
		
		String numbersString = "10 25 5 120 42";
//		Arrays.stream(numbersString.split(" ")).mapToInt(x -> Integer.parseInt(x)).forEach(System.out::println);
//		Arrays.stream(numbersString.split(" ")).map(x -> Integer.parseInt(x)).forEach(System.out::println);
//		Arrays.stream(numbersString.split(" ")).map(Integer::valueOf).forEach(System.out::println);
		
		// Partition of a list
//		List<Integer> pList = Arrays.asList(3,4,6,5,1,8,9);
//		Map<Boolean, List<Integer>> pListStream = pList.stream().collect(Collectors.partitioningBy(x -> x%2==0));
//		System.out.println("Even List:" + pListStream.get(true));
//		System.out.println("Odd List:" + pListStream.get(false));
		
		// peek()
//		numbers.stream().peek(System.out::println).filter(x -> x < 30).collect(Collectors.toList());
		
		// Stop
//		numbers.stream().peek(System.out::println).anyMatch(x -> x ==30);
		
		// filter-peek-map-peek
//		Stream<Integer> filter = numbers.stream().peek(x -> System.out.println("peek-" + x)).filter(x -> x < 40);
//		filter.forEach(System.out::println);
		
		// [1-10] : group by 1-5 and 6-10 range
		List<Integer> rangeNumbers = Arrays.asList(5,6,2,1,8,9,3,7,10,4);
//		Map<String, List<Integer>> collect = rangeNumbers.stream().collect(Collectors.groupingBy(x -> {
//			if((1 >= x) || (x <=5)) {
//				return "Range:1-5";
//			} else if ((6 >= x) || (x <=10)) {
//				return "Range: 6-10";
//			} else {
//				return "Unknown Range:";
//			}
//		}));
//		System.out.println(collect);
		
		
		// [1-10] : group by 1-5 and 6-10 range and sort then also
//		Map<String, List<Integer>> collect2 = rangeNumbers.stream().collect(Collectors.groupingBy(x -> {
//			if((1 >= x) || (x <=5)) {
//				return "Range:1-5";
//			} else if ((6 >= x) || (x <=10)) {
//				return "Range: 6-10";
//			} else {
//				return "Unknown Range:";
//			}
//		},
//		Collectors.collectingAndThen(
//				Collectors.toList(), 
//				list -> list.stream().sorted().collect(Collectors.toList())
//		)
//	  ));
//		System.out.println(collect2);
//		
		
		// Number of element in fibonacii series
		
		List<Integer> collect = Stream.iterate(new int[]{0,1}, t -> new int[] {t[1] , t[0]+ t[1]})
			.limit(5)
			.map(t -> t[0])
			.collect(Collectors.toList());
		System.out.println(collect);
	}

}
