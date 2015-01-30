package com.qiu.liming.designPattern.facade;

public class Camera {

	public void turnOn() {
		System.out.println("Camera turn on()!!!");
	}
	
	public void turnOff() {
		System.out.println("Camera turn off()!!!");
	}
	
	public void rotate(String degree) {
		System.out.println("Camera rotate:" +degree + " degree");
	}
}
