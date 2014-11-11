package com.hp.liming.thinkinginjava.demo.interfacer;

public interface InterfaceContainStaticClass {

	public void fun();
	

	public class nestedStaticClass{

		public static void fuo() {
			System.out.println("nestedStaticClass fuo");
		}
		
	}
}
