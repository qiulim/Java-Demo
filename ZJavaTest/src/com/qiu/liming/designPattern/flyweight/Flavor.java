package com.qiu.liming.designPattern.flyweight;

public class Flavor extends Order {

	private String flavor;
	
	public Flavor(String flavor) {
		this.flavor = flavor;
	}
	
	@Override
	public void serve(Table table) {
		System.out.println("Serving table" + table.getNumber() +"with Flavor" +flavor);

	}

	@Override
	public String getFlavor() {
		return flavor;
	}

}
