package com.iiht.iocday2;

public class Triangle implements Shape{

	private double base;
	private double height;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	
	
	
	
}
