package com.hp.liming.designPattern.proxy;

public class RealResearch implements Seacher {

	@Override
	public void doResearch() {
		System.out.println("do research()!!!");
	}

}
