package com.ust.iocday2;

public class Rhombus implements Shape {
	private double diag1;
	private double diag2;

	
	public double getDiag1() {
		return diag1;
	}

	public void setDiag1(double diag1) {
		this.diag1 = diag1;
	}

	public double getDiag2() {
		return diag2;
	}

	public void setDiag2(double diag2) {
		this.diag2 = diag2;
	}

	public Rhombus() {
		super();
	}

	public Rhombus(double diag1, double diag2) {
		super();
		this.diag1 = diag1;
		this.diag2 = diag2;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return diag1*diag2*0.5;
	}

}
