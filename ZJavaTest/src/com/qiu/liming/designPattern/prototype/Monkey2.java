package com.qiu.liming.designPattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Monkey2 implements Cloneable ,Serializable{

	private int height;
	private int weight;
	private GoldRingedStaff staff = new GoldRingedStaff();
	private Date birthDate;
	
	public Monkey2() {
		birthDate = new Date();
	}
	
	public Object deepClone () throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (oi.readObject());
	}
	
	
	@SuppressWarnings("finally")
	public Object clone() {
		Monkey2 temp = null;
		
		try{
			temp = (Monkey2) super.clone();
			
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
