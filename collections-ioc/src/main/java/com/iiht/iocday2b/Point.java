package com.iiht.iocday2b;

public class Point {

	public int x;
	public int y;
	
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	
}
