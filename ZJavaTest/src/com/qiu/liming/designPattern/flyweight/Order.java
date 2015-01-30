package com.qiu.liming.designPattern.flyweight;

public abstract class Order {

	/**
	 * ��������������
	 * @param table
	 */
	public abstract void serve(Table table);
	
	/**
	 * ������������
	 * @return
	 */
	public abstract String getFlavor();
}
