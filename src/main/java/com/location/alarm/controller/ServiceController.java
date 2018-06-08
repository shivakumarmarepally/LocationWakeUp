package com.location.alarm.controller;

import javax.validation.Valid;

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
	
	@Autowired
	ServiceManager serviceManager;
	
	@PostMapping("/login")
	 public Login login(@Valid @RequestBody Login login) {
	     Login loginDetails =  serviceManager.findByEmailAndPassword(login.getEmail(), login.getPassword());
	    		 
	     /*UserDetails userDetails = new UserDetails();
	     if(loginDetails != null)
	     {
	    	 userDetails = userDetailsRepository.findByLoginId(loginDetails.getLoginId())
	    	 .orElseThrow(() -> new ResourceNotFoundException("UserDetails", "loginId", login.getLoginId()));
	     }*/
	     
		return loginDetails;
	     
	 }

}
