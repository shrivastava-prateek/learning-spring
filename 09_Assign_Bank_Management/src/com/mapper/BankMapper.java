package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bank.Bank;

public class BankMapper implements RowMapper<Bank> {

	@Override
	public Bank mapRow(ResultSet set, int rowNum) throws SQLException {
		    Bank bank= new Bank();
	        bank.setBankId(set.getInt(1));
	        bank.setBankname(set.getString(2));
	        bank.setBankbranch(set.getString(3));
	        bank.setBankAddress(set.getString(4));
			return bank;
	}

}
