package com.qiu.liming.designPattern.chainOfResponsibility;

public abstract class Player {

	private Player successor;
	
	public abstract void handler();
	
	public Player(){
		successor = null;
	}
	
	
	protected void setSuccessor(Player asuccessor) {
		successor = asuccessor;
	}
	
	protected void next() {
		if(successor !=null ) {
			successor.handler();
		} else {
			System.out.println("system terminated");
			System.exit(0);
		}
		
	}
	
	
}
