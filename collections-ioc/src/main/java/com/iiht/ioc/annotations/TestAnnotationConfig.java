package com.iiht.ioc.annotations;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfig {

	public TestAnnotationConfig() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = Logger.getLogger("TestAnnotationConfig");
		
		/*
		 *  life cycle annotations:
		 */		
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Object obj = context.getBean(LifeCycleAnnotations.class);
		
		logger.info(obj.toString());
		
		
		context.registerShutdownHook(); 
		context.close();
		
		
		
		
		
		
		
		
		/*########################################################################*/
		
		/*
		 * AnnotationConfigApplicationContext context = new
		 * AnnotationConfigApplicationContext(JdbcConnector.class);
		 * 
		 * 
		 * 
		 * logger.info(context.toString());
		 * 
		 * JdbcConnector connector =
		 * (JdbcConnector)context.getBean("jdbcConnector",JdbcConnector.class);
		 * 
		 * boolean has = context.containsBean("jdbcConnector"); logger.info(has +"");
		 * 
		 * context.registerShutdownHook(); context.close();
		 */
		
		/*
		 * String str = context.getType("JdbcConnector").toString(); logger.info(str);
		 */
		 
		 
	}

}
