package com.qiu.liming.designPattern.visitor;

public class VisitorA implements Visitor {

	@Override
	public void visit(NodeA node) {
		System.out.println(node.operaitonA());
		
	}

	@Override
	public void visit(NodeB node) {
		System.out.println(node.operaitonB());
		
	}

}
