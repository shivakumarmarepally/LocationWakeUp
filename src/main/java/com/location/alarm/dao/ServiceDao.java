package com.location.alarm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.location.alarm.beans.Login;

@Repository
public class ServiceDao {

	@Autowired
	protected JdbcTemplate jdbcTemplate;
	
	public Login findByEmailAndPassword(String email, String password)
	{
		Login login = new Login();
		
		try
		{
			login = jdbcTemplate.queryForObject(
					"SELECT * FROM login where email = ? AND password = ?",
					new Object[] { email, password },
					new BeanPropertyRowMapper<Login>(
							Login.class));
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		return login;
	}
}
