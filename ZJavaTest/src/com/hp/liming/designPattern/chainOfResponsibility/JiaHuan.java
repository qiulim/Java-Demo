package com.hp.liming.designPattern.chainOfResponsibility;

public class JiaHuan extends Player {

	public JiaHuan(Player asuccessor) {
		this.setSuccessor(asuccessor);
	}
	
	@Override
	public void handler() {
		if(DrumBeater.stopped) {
			System.out.println("Jia huan gotta drink");
		} else {
			System.out.println("Jia huan passed!");
			next();
		}
	}

}
