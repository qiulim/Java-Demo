package com.qiu.liming.designPattern.visitor;

public class NodeB extends Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	public String operaitonB() {
		return "NodeB is visited";
	}
}
