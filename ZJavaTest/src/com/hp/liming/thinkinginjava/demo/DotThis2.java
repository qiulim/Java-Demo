package com.hp.liming.thinkinginjava.demo;

public class DotThis2 {

	public class Inner{
		public Inner() {System.out.println("inner class is created!");}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotThis2 dt = new DotThis2();
		DotThis2.Inner dti = dt.new Inner();
	}

}
