package com.ust.iocday2;

public class Triangle implements Shape {
	private double hypotenoues;
	private double breadth;
	
	

	public Triangle() {
	}

	public Triangle(double hypotenoues, double breadth) {
		super();
		this.hypotenoues = hypotenoues;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Triangle [hypotenoues=" + hypotenoues + ", breadth=" + breadth + "]";
	}

	public double getHypotenoues() {
		return hypotenoues;
	}

	public void setHypotenoues(double hypotenoues) {
		this.hypotenoues = hypotenoues;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5*hypotenoues*breadth;
	}

}
