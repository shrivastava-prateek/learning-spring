package com.wiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="emp_annot")
public class Employee1 {

	private int id;
	@Autowired
	private Address1 address;
	
	
	/*public Employee1() {
		super();
	}*/
	/*public Employee(Address addr) {
		super();
		this.address = addr;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
	
	
}
