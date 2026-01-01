package com.st.stream.emp;

public class Employee {
    private int empNo;
    private String name;
    private int deptno;
    private double sal;

    public Employee(int empNo, String name, int deptno, double sal) {
        this.empNo = empNo;
        this.name = name;
        this.deptno = deptno;
        this.sal = sal;
    }

    public Employee() {
    }


    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", deptno=" + deptno +
                ", sal=" + sal +
                '}';
    }
}
