package com.qiu.liming.designPattern.simpleFactory;

public class ProductSimpleFactory {

	public static IProduct ProductFactory(String name) {
		
		if ("Product1".equals(name)) {
			return new Product1();
		} else if ("Product2".equals(name)) {
			return new Product2();
		} else {
			return null;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProductFactory("Product1").sayHello();
		ProductFactory("Product2").sayHello();
	}

}
