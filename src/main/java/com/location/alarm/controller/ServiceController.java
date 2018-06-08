package com.location.alarm.controller;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.alarm.beans.Login;
import com.location.alarm.manager.ServiceManager;



@RestController
@RequestMapping("/service")
public class ServiceController {
	
	private static final Logger logger = LogManager.getLogger(ServiceController.class);
	
	@Autowired
	ServiceManager serviceManager;
	
	@PostMapping("/login")
	 public Login login(@Valid @RequestBody Login login) {
	     Login loginDetails =  serviceManager.findByEmailAndPassword(login.getEmail(), login.getPassword());
	     logger.info("Info");
	     logger.error("Error");
	     logger.debug("debug");
	     logger.warn("Warn");
	     logger.fatal("Fatal");
		return loginDetails;
	     
	 }

}
