package com.qiu.liming.designPattern.chainOfResponsibility;

public class JiaShe extends Player {

	public JiaShe(Player asuccessor) {
		this.setSuccessor(asuccessor);
	}
	
	@Override
	public void handler() {
		if(DrumBeater.stopped) {
			System.out.println("Jia She gotta drink");
		} else {
			System.out.println("Jia She passed!");
			next();
		}

	}

}
