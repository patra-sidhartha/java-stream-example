package com.st.stream.emp;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapFromList {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(102, "Debu", 30, 3000),
                new Employee(102, "Debu", 30, 3000),
                new Employee(101, "Sid", 20, 4000),
                new Employee(103, "Satya", 10, 2000),
                new Employee(100, "Lalit", 30, 5000)
        );
//        1. Basic 1:1 Mapping
//        Used when you have unique keys (like empno). If a duplicate key is encountered, it throws an IllegalStateException.
//        Map EmpNo to Employee Object
        Map<Integer, Employee> mapEmpNoToEmpObj = empList.stream().collect(Collectors.toMap(
                Employee::getEmpNo,
                Function.identity(),
                (oldV, newV) -> oldV
        ));
//        System.out.println(mapEmpNoToEmpObj);


//        Map EmpNo to Employee Name:
        Map<Integer, String> mapEmpNoToName = empList.stream().collect(Collectors.toMap(
                Employee::getEmpNo,
                Employee::getName,
                (oldV, newV) -> oldV
        ));
//        System.out.println(mapEmpNoToName);

//        2. Handling Duplicate Keys (Merge Function)
//        If your list might have duplicate keys (e.g., mapping by dept), you must provide a Merge Function to decide which value to keep.
//                Keep the first employee found:
//        Keep the employee with the highest salary:
        Map<Integer, Employee> deptWiseHihestSal = empList.stream().collect(Collectors.toMap(
                        Employee::getDeptno,
                        e -> e,
                        (e1, e2) -> e1.getSal() > e2.getSal() ? e1 : e2
                )
        );
//        System.out.println(deptWiseHihestSal);

//        3. Specific Map Implementation (Supplier)
//        By default, toMap returns a HashMap. You can specify a different type like TreeMap or LinkedHashMap using a Map Supplier.
//        Collect into a LinkedHashMap (Preserves insertion order):
        Map<Integer, String> orderedMap = empList.stream()
                .collect(Collectors.toMap(
                        Employee::getEmpNo,
                        Employee::getName,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new
                ));
//        System.out.println(orderedMap);

//        4. Sort the Map based on Key or Value
        //Sort the Map based on key
        Map<Integer, String> sortOnKey = orderedMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
        ));
//        System.out.println(sortOnKey);

        //Sort the Map based on key desc
        Map<Integer, String> sortOnKeyDesc = orderedMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldV, newV) -> oldV,
                        LinkedHashMap::new
                ));
//        System.out.println(sortOnKeyDesc);

        // Sort Based on Emp No of emp
        LinkedHashMap<Integer, Employee> sortBasedOnValue = mapEmpNoToEmpObj.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getEmpNo)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldV, newV) -> oldV,
                        LinkedHashMap::new

                ));
        System.out.println(sortBasedOnValue);

        // Sort Based on Emp No of emp DESC
        LinkedHashMap<Integer, Employee> sortBasedOnValueDesc = mapEmpNoToEmpObj.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getEmpNo).reversed()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldV, newV) -> oldV,
                        LinkedHashMap::new

                ));
        System.out.println(sortBasedOnValueDesc);

    }
}
