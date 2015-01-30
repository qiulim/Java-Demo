package com.qiu.liming.thinkinginjava.demo;

public class DotThis {

	public void f() {System.out.println("DotThis.f()");}
	
	private class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}
	
	public Inner inner() { return new Inner();}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}

}
