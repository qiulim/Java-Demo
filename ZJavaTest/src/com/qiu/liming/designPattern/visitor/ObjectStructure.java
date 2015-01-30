package com.qiu.liming.designPattern.visitor;

import java.util.Enumeration;
import java.util.Vector;

public class ObjectStructure {
	private Vector<Node> nodes;
	private Node node;
	
	public ObjectStructure() {
		nodes = new Vector<Node>();
	}
	
	public void action(Visitor visitor) {
		
		for(Enumeration e = nodes.elements(); e.hasMoreElements();) {
			node = (Node)e.nextElement();
			node.accept(visitor);
		}
	}
	
	public void add(Node node){
		nodes.addElement(node);
	}
}
