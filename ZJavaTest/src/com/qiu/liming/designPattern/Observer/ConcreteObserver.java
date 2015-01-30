package com.qiu.liming.designPattern.Observer;

public class ConcreteObserver implements Observer {

	private String name;
	
	public ConcreteObserver(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println(name + " upadte() is invoked!!!");

	}

	

}
