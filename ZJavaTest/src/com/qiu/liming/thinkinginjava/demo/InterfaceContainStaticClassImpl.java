package com.qiu.liming.thinkinginjava.demo;

import com.qiu.liming.thinkinginjava.demo.interfacer.InterfaceContainStaticClass;

public class InterfaceContainStaticClassImpl implements InterfaceContainStaticClass{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InterfaceContainStaticClass icsc = new InterfaceContainStaticClassImpl();
		InterfaceContainStaticClass.nestedStaticClass.fuo();
	}

	@Override
	public void fun() {
		System.out.println("InterfaceContainStaticClassImpl fun()");
		
	}

}
