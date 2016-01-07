package com.mypack;

import org.springframework.beans.factory.InitializingBean;

public class MyData1 implements InitializingBean {
	private int data;

	public MyData1() {
		super();
		System.out.println("default cons invoked2");
	}
	
	public void init(){
		System.out.println("initialization done2");
	}
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public void afterPropertiesSet()throws Exception { // implicit invocation
		System.out.println("boom : properties set2");
	}

}
