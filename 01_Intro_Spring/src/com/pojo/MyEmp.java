package com.pojo;

public class MyEmp {

	private int id;
	private String name;
	private Date joinDate;
	
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
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	@Override
	public String toString() {
		return "MyEmp [id=" + id + ", name=" + name + ", joinDate=" + joinDate
				+ "]";
	}
	
	
}
