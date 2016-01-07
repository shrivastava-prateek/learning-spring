package com.pojo;

import org.springframework.stereotype.Component;

@Component(value="comp")
public class MyCompany {
	private String compId;
	private String compName;
	private String compAddress;
	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompAddress() {
		return compAddress;
	}
	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}
	
	public void showCompanyInfo(){
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "MyCompany [compId=" + compId + ", compName=" + compName
				+ ", compAddress=" + compAddress + "]";
	}

	
}
