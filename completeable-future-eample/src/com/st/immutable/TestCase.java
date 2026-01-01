package com.st.immutable;

public class TestCase {
    public static void main(String[] args) {
        Address originalAddress = new Address("12344", "Odisha");

        EmployeeImmutable emp = new EmployeeImmutable(originalAddress);
        Address add = emp.getAdd();
        add.setContact("5677");
        originalAddress.setContact("8990");

        System.out.println(add.getContact());
        System.out.println(emp.getAdd().getContact());
    }
}
