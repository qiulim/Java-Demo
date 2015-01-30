package com.qiu.liming.designPattern.command;

public class ConcreteCommand implements Command {

	Receiver receiver;
	public ConcreteCommand(Receiver areceiver) {
		receiver = areceiver;
	}
	
	@Override
	public void execute() {
		receiver.action();

	}

}
