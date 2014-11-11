package com.hp.liming.thinkinginjava.demo;

import com.hp.liming.thinkinginjava.demo.interfacer.Service;
import com.hp.liming.thinkinginjava.demo.interfacer.ServiceFactory;

public class implmention1 implements Service{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1() {
		System.out.println("implemention1 method1");
		
	}

	@Override
	public void method2() {

		System.out.println("implemention1 method2");
	}
	
	public static ServiceFactory factory = new ServiceFactory() {
		
		@Override
		public Service getService() {
			return new implmention1();
		}
	};

}
