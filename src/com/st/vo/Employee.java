package com.st.vo;

public class Employee {
	private int empNo;
	private String name;
	private String dept;
	private double sal;

	public Employee(int empNo, String name, String dept, double sal) {
		super();
		this.empNo = empNo;
		this.name = name;
		
		this.dept = dept;
		this.sal = sal;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", empNo=" + empNo + ", name=" + name + ", sal=" + sal + "]";
	}

}
