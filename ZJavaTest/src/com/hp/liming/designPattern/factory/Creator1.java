package com.hp.liming.designPattern.factory;

public class Creator1 implements ICreator {

	@Override
	public IProduct getFactory() {
		return new Product1();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
