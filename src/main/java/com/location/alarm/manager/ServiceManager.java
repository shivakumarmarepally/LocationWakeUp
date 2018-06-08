package com.location.alarm.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.alarm.beans.Login;
import com.location.alarm.dao.ServiceDao;


@Service
public class ServiceManager {
	
	@Autowired
	ServiceDao serviceDao;
	
	public Login findByEmailAndPassword(String email, String password)
	{
		
		return serviceDao.findByEmailAndPassword(email, password);
	}

}
