package com.myimpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="MyImpl")
public class MyImplementation {
    @Value(value="abcd")
	private String data;
    @Value(value="100")
	private int data_id;
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getData_id() {
		return data_id;
	}
	public void setData_id(int data_id) {
		this.data_id = data_id;
	}
	
	@Override
	public String toString() {
		return "MyImplementation [data=" + data + ", data_id=" + data_id + "]";
	}
	
	
}
