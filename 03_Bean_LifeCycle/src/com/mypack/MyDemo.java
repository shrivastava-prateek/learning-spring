package com.mypack;

public class MyDemo {

	private int demoId;
	private String demoName;
	
	public int getDemoId() {
		return demoId;
	}
	public void setDemoId(int demoId) {
		this.demoId = demoId;
	}
	public String getDemoName() {
		return demoName;
	}
	public void setDemoName(String demoName) {
		this.demoName = demoName;
	}
	
	@Override
	public String toString() {
		return "MyDemo [demoId=" + demoId + ", demoName=" + demoName + "]";
	}
	

}
