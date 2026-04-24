package com.st.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//    “I know how to compare others”
//    Package: java.util
//    Method: compare(T o1, T o2)
//    Custom / multiple orderings
//    Implemented outside the class

class Employee {
    int id; String name; double salary;

    Employee(int id, String name, double salary) {
        this.id = id; this.name = name; this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EmployeeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.id, e2.id);
    }
}

class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class EmployeeSalaryDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.salary, e1.salary);
    }
}

class EmployeeNameThenSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int nameCompare = e1.name.compareTo(e2.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Double.compare(e1.salary, e2.salary);
    }
}

public class MyComparator {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(3, "Bob", 60000));
        empList.add(new Employee(1, "Alice", 80000));
        empList.add(new Employee(2, "Charlie", 70000));

        Collections.sort(empList, new EmployeeIdComparator());
        System.out.println(empList);

        Collections.sort(empList, new EmployeeIdComparator().reversed());
        System.out.println(empList);

        Collections.sort(empList, new EmployeeSalaryDescComparator());
        System.out.println(empList);

        Collections.sort(empList, new EmployeeNameThenSalaryComparator().reversed());
        System.out.println(empList);
    }
}
