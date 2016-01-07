package com.pojo;

import org.springframework.stereotype.Component;

@Component(value="emp")
public class Employee {

	private int id;
	private Address address;
	
	
	public Employee() {
		super();
	}
	public Employee(Address addr) {
		super();
		this.address = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
	
	
}
