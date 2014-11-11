package com.hp.liming.interfaceImpl;

import com.hp.liming.interfacePackage.testInterface;

public class testInterfaceImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello(new testInterface() {
			
			@Override
			public void tHello() {
				// TODO Auto-generated method stub
				System.out.println("tHello is invoked!");
			}
		});
	}

	public static void sayHello(testInterface it) {
		System.out.println("sayHello is invoked!");
		it.tHello();
	}
}
