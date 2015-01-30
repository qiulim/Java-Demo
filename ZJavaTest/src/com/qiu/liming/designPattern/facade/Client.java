package com.qiu.liming.designPattern.facade;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SecurityFacade sf = new SecurityFacade();
		sf.activate();
		
		sf.deactivate();

	}

}
