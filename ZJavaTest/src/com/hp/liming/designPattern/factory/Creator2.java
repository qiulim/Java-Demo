package com.hp.liming.designPattern.factory;

public class Creator2 implements ICreator {

	@Override
	public IProduct getFactory() {
		return new Product2();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
