package com.qiu.liming.test;

public class Bean {

	 String arg1;
	 String arg2;
	 
	 public Bean() {
		 arg1 = "default1";
		 arg2 = "default2";
	 }
	 
	 @Override
	 public String toString() {
		 return "arg1:"+arg1 + " arg2:" + arg2;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
