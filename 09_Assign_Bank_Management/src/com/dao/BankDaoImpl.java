package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bank.Bank;
import com.mapper.BankMapper;

public class BankDaoImpl implements BankDao {
private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	@Override
	public int addBank(Bank bank) {
		String sql ="insert into bank values(?,?,?,?)";
		int r= jdbcTemplate.update(sql, new Object[]{bank.getBankId(),bank.getBankname(),bank.getBankbranch(),bank.getBankAddress()});
		return r;
	}

	@Override
	public boolean removeBank(int bid) {
		boolean deleted=false;
		String sql="delete from bank where bankId =?";
		int r= jdbcTemplate.update(sql,bid);
		if(r>0){
			deleted = true;
		}
		else deleted = false;
		
		return deleted;
	}

	@Override
	public List<Bank> displayAllBanks() {
		String sql ="select * from bank";
		List<Bank> banks=jdbcTemplate.query(sql, new BankMapper());
		
		return banks;
	}

}
