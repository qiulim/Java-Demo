package com.hp.liming.designPattern.chainOfResponsibility;

public class JiaBaoYu extends Player {

	public JiaBaoYu(Player asuccessor) {
		this.setSuccessor(asuccessor);
	}
	
	@Override
	public void handler() {
		if(DrumBeater.stopped) {
			System.out.println("Jia bao yu gotta drink");
		} else {
			System.out.println("Jia bao yu passed!");
			next();
		}
	}

}
