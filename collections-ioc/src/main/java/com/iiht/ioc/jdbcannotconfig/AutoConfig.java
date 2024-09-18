package com.iiht.ioc.jdbcannotconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.iiht.ioc.jdbcannotconfig")

@PropertySource("classpath:application.properties")
public class AutoConfig {
	
	
	@Value("${jdbc.url}")
    private String url;

    @Value("$jdbc.username")
    private String username;

    @Value("$jdbc.password")
    private String password;

	@Bean("connection")
	public JDBCConnnectionUtil createUtil() {
		
		
		/*
		 * return new JDBCConnnectionUtil
		 * 
		 * ("jdbc:mysql://localhost:3306/test","root","pass@word1");
		 */		
		
		return new JDBCConnnectionUtil (url,username,password);
		
			
	}
	
	
}
