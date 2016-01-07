package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.Bank;
import com.dao.BankDao;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BankDao bankDao = (BankDao)context.getBean("banktemplate");
		int r=bankDao.addBank(new Bank(3,"HDFC","Dhantoli","Dhantoli Nagpur"));
		if(r>0){
			System.out.println(r+" record inserted");
		}
		else{
			System.out.println("record not inserted");
		}
		
		if(bankDao.removeBank(1)){
			System.out.println("Bank deleted");
		}
		else{
			System.out.println("bank is not removed");
		}
		
		List<Bank> banks =bankDao.displayAllBanks();
		System.out.println("Bank Id\tBankName\tBranch\t Address");
		for(Bank bank:banks){
			System.out.println(bank.getBankId()+" \t "+bank.getBankname()+"  \t  "+bank.getBankbranch()+" \t "+bank.getBankAddress());
		}

	}

}
