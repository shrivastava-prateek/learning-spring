package com.mypack;

public class MyData {
	private int data;

	public MyData() {
		super();
		System.out.println("default cons invoked");
	}
	
	public void init(){
		System.out.println("initialization done");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public void myDestroy(){
		System.out.println("memory released");
	}

}
