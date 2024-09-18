package com.iiht.ioc.annotations;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleAnnotations {

	public LifeCycleAnnotations() {
		logger.info("from default constructor");
	}

	Logger logger = Logger.getLogger("LifeCycleAnnotations");
	
	@PostConstruct
	public void myInit() {
		logger.info("init called");
	}
	
	@PreDestroy
	public void myDestroy() {
		logger.info("destroy called");
	}
}
