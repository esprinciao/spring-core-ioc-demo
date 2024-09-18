package com.iiht.ioc.annotations;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class JdbcConnector {

	public JdbcConnector() {
		// TODO Auto-generated constructor stub
		
	
	}
	
	
	Logger logger = Logger.getLogger("JdbcConnector");
	
	@PostConstruct
	public void myInit() {
		logger.info("init called");
	}
	
	@PreDestroy
	public void myDestroy() {
		logger.info("destroy called");

	}

}
