package com.qiu.liming.PeopleWear;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BaseComponent bc = new BaseComponent();
		IDecorate cap = new Cap(bc);
		IDecorate Tie = new Tie(cap);
		Tie.showWearing();
	}

}
