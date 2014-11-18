package com.hp.liming.designPattern.chainOfResponsibility;

public class JiaMu extends Player {

	public JiaMu(Player asuccessor) {
		this.setSuccessor(asuccessor);
	}
	
	@Override
	public void handler() {
		if(DrumBeater.stopped) {
			System.out.println("Jia Mu gotta drink");
		} else {
			System.out.println("Jia Mu passed!");
			next();
		}

	}

}
