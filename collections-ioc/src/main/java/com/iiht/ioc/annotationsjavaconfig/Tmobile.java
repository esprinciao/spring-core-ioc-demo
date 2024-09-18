package com.iiht.ioc.annotationsjavaconfig;

import org.springframework.stereotype.Component;

@Component
public class Tmobile implements Sim {

	public Tmobile() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		return false;
	}

}
