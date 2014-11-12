package com.hp.liming.designPattern.adapter;

public class John implements Puppies{

	private Kittie kittie;
	
	public John(Kittie ki) {
		kittie = ki;
	}

	@Override
	public void wao() {
		kittie.miao();
		
	}

	@Override
	public void fetchBall() {
		kittie.catchRat();
		
	}

	@Override
	public void run() {
		kittie.run();
		
	}

	@Override
	public void sleep() {
		kittie.sleep();
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
