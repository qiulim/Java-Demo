package com.qiu.liming.thinkinginjava.demo;

import com.qiu.liming.thinkinginjava.demo.interfacer.testInterface;

public class Parcel2 {

	protected class innerParcel2 implements testInterface {

		@Override
		public void hello() {
			System.out.println("innerParcel2 's interface");
		}
		
	}
	
	public innerParcel2 getInnerParcel2 () {
		return new innerParcel2();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
