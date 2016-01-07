package com.log1;

public class StudentCal implements MyInterface {
	private Integer age;
	private String name;
	private int[] marks;

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printthrowexception(){
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}

	@Override
	public int add() {
		System.out.println("add returning 10");
		return 10;
	}

	@Override
	public int sub() {
		System.out.println("in sub returning 0");
		return 0;
	}

}
