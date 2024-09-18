package com.iiht.iocday2b;

import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Testline {

	public Testline() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Object obj = context.getBean("line");
		Line line = (Line) obj;
		System.out.println(line);
		
	}
}
		 