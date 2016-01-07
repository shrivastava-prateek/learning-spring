package com.dao;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class JdbcNamedTemplateBank {
private NamedParameterJdbcTemplate namedJdbctemplate;

public NamedParameterJdbcTemplate getNamedJdbctemplate() {
	return namedJdbctemplate;
}

public void setNamedJdbctemplate(NamedParameterJdbcTemplate namedJdbctemplate) {
	this.namedJdbctemplate = namedJdbctemplate;
}

public void saveData(){
	//implement using named jdbc template
}
}
