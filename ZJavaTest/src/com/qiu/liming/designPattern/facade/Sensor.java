package com.qiu.liming.designPattern.facade;

public class Sensor {

	public void activate() {
		System.out.println("Sensor activate()!!!");
	}
	
	
	public void deactivate() {
		System.out.println("Sensor deactivate()!!!");
	}
	
	public void trigger() {
		System.out.println("Sensor trigger()!!!");
	}
}
