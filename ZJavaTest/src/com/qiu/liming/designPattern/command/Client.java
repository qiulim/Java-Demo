package com.qiu.liming.designPattern.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver = new Receiver();
		ConcreteCommand cc = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(cc);
		invoker.action();
	}

}
