package com.iiht.iocday2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.util.logging.Logger;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 BeanFactory factory = new FileSystemXmlApplicationContext("beans.xml");
		 
		
		/*
		 * ClassPathXmlApplicationContext factory = new
		 * ClassPathXmlApplicationContext("beans.xml"); factory.registerShutdownHook();
		 */
		// System.out.println(factory);

		Logger logger = Logger.getLogger("TestShapes");
		logger.info(factory + "");

		Shape s = (Rectangle) factory.getBean("rect");
		Shape s1 = (Rectangle) factory.getBean("rect");

		logger.info(s + "");
		
		boolean result = s == s1;
		logger.info("CHECK:" + result);

		/* System.out.println(s); */

		double rectResult = s.area();
		logger.info("rectArea: " + rectResult);

		String r = s.getShape();
		logger.info("packageName: " + r);

		

		Shape t = (Triangle) factory.getBean("tria");
		logger.info(t + "");

		Shape k = (Rhombus) factory.getBean("rhomb");
		logger.info(k + "");

		double triaResult = t.area();
		logger.info("triaArea: " + triaResult);

		String p = t.getShape();
		logger.info("packageName: " + p);

		double rhombResult = k.area();
		logger.info("rhombusArea: " + rhombResult + " ");

		String m = k.getShape();
		logger.info("packageName: " + m);

	}

}
