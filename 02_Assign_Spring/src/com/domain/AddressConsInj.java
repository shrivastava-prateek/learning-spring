package com.domain;

public class AddressConsInj {
	private String city,state,pincode;

	public AddressConsInj(String city, String state, String pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressConsInj [city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	

}
