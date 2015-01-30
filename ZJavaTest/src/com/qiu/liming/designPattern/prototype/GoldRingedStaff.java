package com.qiu.liming.designPattern.prototype;

import java.io.Serializable;

public class GoldRingedStaff implements Serializable{

	private float height = 100.0F;
	private float diameter = 10.0F;
	

	public GoldRingedStaff() {
		
	}
	
	public void grow() {
		diameter *= 2.0;
		height *= 2.0;
		
	}
	
	public void shrink() {
		diameter /= 2.0;
		height /= 2.0;
		
	}
	
	public void move() {
		
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	
}
