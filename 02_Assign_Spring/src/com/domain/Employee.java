package com.domain;

public class Employee {

	int empId;
	String empName;
	int empAge;
	
	public Employee() {
		super();
		this.empId = 20528;
		this.empName = "Prateek Shrivastava";
		this.empAge = 23;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empAge=" + empAge + "]";
	}
	
	
	
}
