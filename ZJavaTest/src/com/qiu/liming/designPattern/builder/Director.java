package com.qiu.liming.designPattern.builder;

public class Director {

	private static  Builder builder;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		builder = new ConcreteBuilder1();
		builder.buildPart1();
		builder.buildPart2();
		builder.reteriveProduct();
	}

}
