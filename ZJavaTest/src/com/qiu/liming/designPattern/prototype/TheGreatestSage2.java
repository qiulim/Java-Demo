package com.qiu.liming.designPattern.prototype;

import java.io.IOException;

public class TheGreatestSage2 {

	private Monkey2 monkey = new Monkey2();
	
	public void change() throws IOException, ClassNotFoundException {
		
		Monkey2 copyMonkey;
		for(int i=0;i<2000;i++) {}
		
		copyMonkey = (Monkey2)monkey.deepClone();
		System.out.println("Monkey king's birth date = "+monkey.getBirthDate());
		System.out.println("Copy Monkey king's birth date = "+copyMonkey.getBirthDate());
		System.out.println("Monkey == Copy Monkey: " +(monkey == copyMonkey));
		System.out.println("Monkey king's staff == Copy Monkey's staff :" + (monkey.getStaff() == copyMonkey.getStaff()));
		
	}
	
	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		TheGreatestSage2 ts = new TheGreatestSage2();
		ts.change();
	}

}
