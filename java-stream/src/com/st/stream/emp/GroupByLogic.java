package com.st.stream.emp;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByLogic {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(102, "Debu", 30, 3000),
                new Employee(102, "Debu", 30, 3000),
                new Employee(101, "Sid", 20, 4000),
                new Employee(103, "Satya", 10, 2000),
                new Employee(100, "Lalit", 30, 5000)
        );
        // We can Do Filter

//        1. Basic Single-Field Grouping
//        ==================================
//        Group by Department:
        Map<Integer, List<Employee>> groupByDept = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptno
        ));
//        System.out.println(groupByDept);

//        Group by Salary:
        Map<Double, List<Employee>> groupBySal = empList.stream().collect(Collectors.groupingBy(
                Employee::getSal
        ));
//        System.out.println(groupBySal);

//        2. Grouping with Aggregations (Summary Statistics)
//        ======================================================
//        Count Employees per Department
        Map<Integer, Long> collect3 = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptno,
                Collectors.counting()
        ));
//        System.out.println(collect3);

//        Average Salary per Department:
        Map<Integer, Double> avgSalPerDept = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptno,
                Collectors.averagingDouble(Employee::getSal)
        ));
//        System.out.println(avgSalPerDept);

//        Total Salary (Sum) per Department:
        Map<Integer, Double> deptWiseTotalSal = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptno,
                Collectors.summingDouble(Employee::getSal)
        ));
//        System.out.println(deptWiseTotalSal);

//        Max/Min Salary Earner per Department:
        Map<Integer, Optional<Employee>> maxSalByDept =empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptno,
//                Collectors.maxBy(Comparator.comparingDouble(Employee::getSal))
                Collectors.minBy(Comparator.comparingDouble(Employee::getSal))
        ));
//        System.out.println(maxSalByDept);

//        3. Multi-Level Grouping
//        ===========================
//        Group by Department, then by Salary:
        Map<Integer, Map<Double, List<Employee>>> groupByDeptThenSal = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptno,
                Collectors.groupingBy(Employee::getSal)
        ));
//        System.out.println(groupByDeptThenSal);


        // By Department, Salary, and then Employee Number:
        Map<Integer, Map<Double, Map<String, List<Employee>>>> groupByDeptSalEmpNo = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptno,
                Collectors.groupingBy(
                        Employee::getSal,
                        Collectors.groupingBy(Employee::getName)
                )
        ));
        System.out.println(groupByDeptSalEmpNo);

//        4. Grouping with Mapping (Extracting Specific Fields)
//        ======================================================
//        Sometimes you only need a specific field (like names) from the grouped objects rather than the whole Employee object.
//        Employee Names by Department:
        Map<Integer, List<String>> groupByDeptAndCollectNames = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptno,
                Collectors.mapping(Employee::getName,
                        Collectors.toList()
                )
        ));
//        System.out.println(groupByDeptAndCollectNames);

        Map<Integer, List<Integer>> groupByDeptSortEmpNo = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptno,
                Collectors.mapping(
                        Employee::getEmpNo,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream().sorted().collect(Collectors.toList())
                        )
                )
        ));

//        System.out.println(groupByDeptSortEmpNo);

//        Sorted by Department Name:
        TreeMap<Object, List<Employee>> collect = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptno, TreeMap::new, Collectors.toList()));
//        System.out.println(collect);



//        5. Partitioning (Special Binary Grouping)
//        ===========================================
//        High vs. Low Salary Partitioning: (e.g., threshold of 50,000)
        Map<Boolean, List<Employee>> partitionBySal = empList.stream().collect(Collectors.partitioningBy(
                e -> e.getSal() > 2000
        ));
//        System.out.println(partitionBySal);

        Map<Boolean, List<Employee>> partitionAndSort = empList.stream().collect(Collectors.partitioningBy(
                e -> e.getSal() > 2000,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList())
                )
        ));
        System.out.println(partitionAndSort);
        // can also do by composite field
    }

}
