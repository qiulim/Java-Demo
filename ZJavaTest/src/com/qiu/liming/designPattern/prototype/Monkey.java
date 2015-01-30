package com.qiu.liming.designPattern.prototype;

import java.util.Date;

public class Monkey implements Cloneable {

	private int height;
	private int weight;
	private GoldRingedStaff staff = new GoldRingedStaff();
	private Date birthDate;
	
	public Monkey() {
		birthDate = new Date();
	}
	
	@SuppressWarnings("finally")
	public Object clone() {
		Monkey temp = null;
		
		try{
			temp = (Monkey) super.clone();
			
		} catch(CloneNotSupportedException e) {
			System.out.println("clone failed!");
		} finally {
			return temp;
		}
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public GoldRingedStaff getStaff() {
		return staff;
	}

	public void setStaff(GoldRingedStaff staff) {
		this.staff = staff;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
