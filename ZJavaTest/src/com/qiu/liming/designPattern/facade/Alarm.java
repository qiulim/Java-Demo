package com.qiu.liming.designPattern.facade;

public class Alarm {
	public void activate() {
		System.out.println("Alarm activate()!!!");
	}
	
	
	public void deactivate() {
		System.out.println("Alarm deactivate()!!!");
	}
	
	public void ring() {
		System.out.println("Alarm ring()!!!");
	}
	
	public void stopRing() {
		System.out.println("Alarm stopRing()!!!");
	}
	
}
