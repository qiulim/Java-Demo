package com.hp.liming.designPattern.template;

public abstract class Template {

	public void hookMethod() {
		doAction1();
		doAction2();
		doAction3();
		
	}
	protected abstract void doAction1();
	protected abstract void doAction2();
	protected abstract void doAction3();
}
