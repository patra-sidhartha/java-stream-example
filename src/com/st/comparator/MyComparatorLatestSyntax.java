package com.st.comparator;

import java.util.*;

public class MyComparatorLatestSyntax {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(3, "Bob", 60000));
        empList.add(new Employee(1, "Alice", 80000));
        empList.add(new Employee(2, "Charlie", 70000));
        Comparator<Employee> byName =
                (e1, e2) -> e1.name.compareTo(e2.name);

        Collections.sort(empList, byName);
        System.out.println(empList);

        Employee[] empArry = {   new Employee(3, "Bob", 60000),
                new Employee(1, "Alice", 80000),
                new Employee(2, "Charlie", 70000)};
        Arrays.sort(empArry, byName.reversed());
        System.out.println("empArry:" + Arrays.toString(empArry));

        Comparator<Employee> byIdDesc =
                Comparator.comparing(Employee::getId).reversed();

//        Multiple fields
        Comparator<Employee> comp =
                Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getId);

//        Null-safe Comparator
        Comparator<Employee> comp1 =
                Comparator.nullsLast(
                        Comparator.comparing(Employee::getName)
                );
        Collections.sort(empList, comp1);

//        Anonymous Class (Still “Implementing”)
        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.id, e2.id);
            }
        });

        Collections.sort(empList,
                (e1, e2) -> Integer.compare(e1.id, e2.id)
        );

//        or
        empList.sort(Comparator.comparing(e -> e.id));



    }
}
