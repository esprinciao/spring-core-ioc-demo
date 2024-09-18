package com.iiht.ioc.annotationsjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	@Qualifier("aTnTsim")
	private Sim simcard;
	
	
	public void turnOn() {
		boolean status = simcard.connect();
		
		/* logger.info(status ? "connected" : "not connected"); */
	}
}
