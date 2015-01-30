package com.qiu.liming.test;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bean b = new Bean();
		System.out.println("before:"+b.toString());
		setBean(b);
		System.out.println("after:"+b.toString());
		
		int i = 0;
		System.out.println("before:" + i);
		setI(i);
		System.out.println("after:" + i);
	}
	
	public static void setBean(Bean bean) {
		bean.arg1 = "method invoked1";
		bean.arg2 = "method invoked2";
	}

	public static void setI(int i) {
		i = 1;
	}
}
