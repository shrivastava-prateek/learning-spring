package com.pojo;

import org.springframework.stereotype.Component;

@Component(value ="emp")
public class EmployeeInfo {
	private int empId;
	private String empName;
	private String empAddress;
	private int empAge;
	
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
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	public void showEmp(){
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "EmployeeInfo [empId=" + empId + ", empName=" + empName
				+ ", empAddress=" + empAddress + ", empAge=" + empAge + "]";
	}
	
	

}
