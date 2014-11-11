package com.hp.liming.thinkinginjava.demo;

import com.hp.liming.thinkinginjava.demo.interfacer.Service;
import com.hp.liming.thinkinginjava.demo.interfacer.ServiceFactory;

public class implmentionFactory {

	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		serviceConsumer(implmention1.factory);
		serviceConsumer(implmention2.factory);


	}

}
