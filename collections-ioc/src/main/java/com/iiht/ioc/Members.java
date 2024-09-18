package com.iiht.ioc;

import java.util.ArrayList;
import java.util.List;

public class Members {
	
	
	/* ArrayList<A> members = new ArrayList<>(); */
	
	List<A> members = new ArrayList<>();
	

	public Members(ArrayList<A> members) {
		super();
		this.members = members;
	}



	public Members() {
		// TODO Auto-generated constructor stub
	}



	public List<A> getMembers() {
		return members;
	}



	public void setMembers(ArrayList<A> members) {
		this.members = members;
	}



	@Override
	public String toString() {
		return "Members [members=" + members + "]";
	}
	
	

	

}
