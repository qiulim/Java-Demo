package com.hp.liming.designPattern.builder;

public class ConcreteBuilder1 extends Builder {

	private IProduct product;
	
	@Override
	public void buildPart1() {
	 System.out.println("ConcreteBuilder1 buildPart1()!!!");

	}

	@Override
	public void buildPart2() {
		 System.out.println("ConcreteBuilder1 buildPart2()!!!");

	}

	@Override
	public IProduct reteriveProduct() {
		
		System.out.println("ConcreteBuilder1 reteriveProduct()!!!");

		return null;
	}

}
