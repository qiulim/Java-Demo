package com.hp.liming.thinkinginjava.demp;

import com.hp.liming.thinkinginjava.demo.Parcel2;
import com.hp.liming.thinkinginjava.demo.interfacer.testInterface;

public class Parcel3 extends Parcel2{

	Parcel2 p2 = new Parcel2();
	testInterface ti = p2.getInnerParcel2();
	public Parcel3 () {
		ti.hello();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Parcel3();
	}

}
