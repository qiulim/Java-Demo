package com.qiu.liming.designPattern.flyweight;

public abstract class Order {

	/**
	 * 将咖啡卖给客人
	 * @param table
	 */
	public abstract void serve(Table table);
	
	/**
	 * 返还咖啡名字
	 * @return
	 */
	public abstract String getFlavor();
}
