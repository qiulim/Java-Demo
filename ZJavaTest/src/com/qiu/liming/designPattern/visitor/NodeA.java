package com.qiu.liming.designPattern.visitor;

public class NodeA extends Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String operaitonA() {
		return "NodeA is visited";
	}

}
