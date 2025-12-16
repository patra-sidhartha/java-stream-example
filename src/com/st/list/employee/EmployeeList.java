package com.st.list.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.st.vo.Employee;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(103, "Satya", "Lead", 3000),
				new Employee(105, "Sid", "Software", 4000),
				new Employee(102, "Lalit", "Lead", 2000),
				new Employee(101, "Debu", "Senior", 4000),
				new Employee(104, "Deepak", "Software", 1000));
		
//		empList.stream().forEach(System.out::println);
//		Map<Integer, Employee> empIdMap = empList.stream().collect(Collectors.toMap(
//				emp -> emp.getEmpNo(), 
//				emp -> emp
//		));
//		System.out.println(empIdMap);
		
		Map<String, Employee> empIdMap = empList.stream().collect(Collectors.toMap(
				emp -> emp.getName(), 
				emp -> emp,
				(old, newV) -> newV,
				LinkedHashMap::new
		));
//		System.out.println(empIdMap);
		
//		empIdMap.entrySet().stream().forEach(entry -> {
//			System.out.print(entry.getKey() + "-");
//			Employee employeeDetails = entry.getValue();
//			System.out.println(entry.getValue().getDept());
////			System.out.println(employeeDetails);
//		});
		
		// Sort based on key
//		Map<String, Employee> collect = empIdMap.entrySet().stream()
//			.sorted(Map.Entry.comparingByKey())
//			.collect(Collectors.toMap(
//				Map.Entry::getKey,   
//				Map.Entry::getValue,
//				(oldV, newV) -> oldV,
//				LinkedHashMap::new
//		));
//		System.out.println(collect);
		
//		Map<String, Employee> collect1 = empIdMap.entrySet().stream()
//				.sorted(Map.Entry.<String, Employee>comparingByKey().reversed())
//				.collect(Collectors.toMap(
//					Map.Entry::getKey,   
//					Map.Entry::getValue,
//					(oldV, newV) -> oldV,
//					LinkedHashMap::new
//			));
//		System.out.println(collect1);
		
//		Map<String, Employee> mapSortEmpNo = empIdMap.entrySet().stream()
//			.sorted(Comparator.comparingInt(entry -> entry.getValue().getEmpNo()))
//			.collect(Collectors.toMap(
//					entry -> entry.getKey(),
//					entry -> entry.getValue(),
//					(oldV, newV) -> oldV,
//					LinkedHashMap::new
//			));
//		System.out.println(mapSortEmpNo);
		
//		Map<String, Employee> mapSortEmpNo1 = empIdMap.entrySet().stream()
//				.sorted(Comparator.comparingInt(entry -> entry.getValue().getEmpNo()))
//				.collect(Collectors.toMap(
//						Map.Entry::getKey,
//						Map.Entry::getValue,
//						(oldV, newV) -> oldV,
//						LinkedHashMap::new
//				));
//			System.out.println(mapSortEmpNo1);
		
		// Sort by the 'empId' integer field in reverse order
		
		Map<String, List<Employee>> collect = empList.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDept()));
		System.out.println(collect);
		
		Map<String, List<Employee>> collect1 = empList.stream().collect(Collectors.groupingBy(
				emp -> emp.getDept(),
				Collectors.collectingAndThen(
						Collectors.toList(), 
						list -> list.stream()
							.sorted(Comparator.comparingInt(Employee::getEmpNo).reversed()).collect(Collectors.toList())
				)
		));
		System.out.println(collect1);


		 // 3. Sort using Java streams and comparators
        // List<Product> sortedProducts = products.stream()
        //     .sorted(Comparator.comparing(Product::getName) // Sort primarily by name
        //               .thenComparing(Product::getCategory)) // Sort secondarily by category
        //     .collect(Collectors.toList());

	}

}
