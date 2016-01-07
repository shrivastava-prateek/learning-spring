package com.bank;

public class Bank {
	
private int bankId;
private String bankname;
private String bankbranch;
private String bankAddress;

public Bank() {
	super();
}
public Bank(int bankId, String bankname, String bankbranch, String bankAddress) {
	super();
	this.bankId = bankId;
	this.bankname = bankname;
	this.bankbranch = bankbranch;
	this.bankAddress = bankAddress;
}
public int getBankId() {
	return bankId;
}
public void setBankId(int bankId) {
	this.bankId = bankId;
}
public String getBankname() {
	return bankname;
}
public void setBankname(String bankname) {
	this.bankname = bankname;
}
public String getBankbranch() {
	return bankbranch;
}
public void setBankbranch(String bankbranch) {
	this.bankbranch = bankbranch;
}
public String getBankAddress() {
	return bankAddress;
}
public void setBankAddress(String bankAddress) {
	this.bankAddress = bankAddress;
}


}
