package com.qiu.liming.designPattern.command;

public class Invoker {

	Command command;
	
	public Invoker(Command acommand) {
		command = acommand;
	}
	
	public void action() {
		command.execute();
	}
}
