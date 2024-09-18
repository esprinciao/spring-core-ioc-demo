package com.iiht.ioc.annotationsjavaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan(basePackages = {"com.iiht.annotationsjavaconfig"})
public class AppConfig {

	public AppConfig() {
		// TODO Auto-generated constructor stub
	}
	
	

}
