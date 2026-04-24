package com.st.compare.comparable;

//“I know how to compare myself”
//Package: java.lang
//Method: compareTo(T o)
//Defines natural ordering
//Implemented inside the class

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee e) {
        return this.id - e.id; // sort by id
//        ❌ return e1.id - e2.id; → overflow risk
//        ❌ Forgetting implements Comparator<Employee>
//⚠️      Comparator must be consistent with equals
    }

    @Override
    public String toString() {
        return "Id:" + id + " name:" + name;
    }
}

public class MyComparable {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(102, "Sid"),
                new Employee(101, "Lalit"),
                new Employee(103, "Manas"));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list.reversed());
        System.out.println(list);

        Employee[] empArry = {   new Employee(102, "Sid"), new Employee(101, "Lalit"),
                                new Employee(103, "Manas")};
//        For Array type
        Arrays.sort(empArry);
        System.out.println("empArray Sort:" + Arrays.toString(empArry));

    }
}











