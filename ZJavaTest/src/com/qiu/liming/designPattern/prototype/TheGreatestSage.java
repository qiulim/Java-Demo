package com.qiu.liming.designPattern.prototype;

public class TheGreatestSage {

	private Monkey monkey = new Monkey();
	
	public void change() {
		
		Monkey copyMonkey;
		for(int i=0;i<2000;i++) {}
		
		copyMonkey = (Monkey)monkey.clone();
		System.out.println("Monkey king's birth date = "+monkey.getBirthDate());
		System.out.println("Copy Monkey king's birth date = "+copyMonkey.getBirthDate());
		System.out.println("Monkey == Copy Monkey: " +(monkey == copyMonkey));
		System.out.println("Monkey king's staff == Copy Monkey's staff :" + (monkey.getStaff() == copyMonkey.getStaff()));
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheGreatestSage ts = new TheGreatestSage();
		ts.change();
	}

}
