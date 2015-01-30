package com.qiu.liming.designPattern.template;

public class ConcreteTemplate extends Template{

	public void doAction() {
		super.hookMethod();
	}
	
	@Override
	protected void doAction1() {
		System.out.println("ConcreteTemplate doAction1()!!!");
	}

	@Override
	protected void doAction2() {
		System.out.println("ConcreteTemplate doAction2()!!!");
		
	}

	@Override
	protected void doAction3() {
		System.out.println("ConcreteTemplate doAction3()!!!");
		
	}

}
