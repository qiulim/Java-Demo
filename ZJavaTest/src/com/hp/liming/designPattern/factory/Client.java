package com.hp.liming.designPattern.factory;

public class Client {

	static IProduct p1,p2;
	static ICreator i1,i2;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		i1 = new Creator1();
		i2 = new Creator2();
		
		p1=i1.getFactory();
		p2=i2.getFactory();

	}

}
