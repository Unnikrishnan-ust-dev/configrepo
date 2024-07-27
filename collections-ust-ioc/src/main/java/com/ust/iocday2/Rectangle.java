/**
 * 
 */
package com.ust.iocday2;

import java.util.logging.Logger;

/**
 * 
 */
public class Rectangle implements Shape {
	private double breadth;
	private double length;
	
	public void init() {
		Logger logger = Logger.getLogger("Rectangle");
		logger.info("init called");
	}
	
	public void destroy() {
		Logger logger = Logger.getLogger("Rectangle");
		logger.info("destroy called");
	}

	public Rectangle() {
	}

	public Rectangle(double breadth, double length) {
		super();
		this.breadth = breadth;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [breadth=" + breadth + ", length=" + length + "]";
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

}
