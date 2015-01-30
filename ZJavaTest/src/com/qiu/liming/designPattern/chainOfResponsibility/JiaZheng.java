package com.qiu.liming.designPattern.chainOfResponsibility;

public class JiaZheng extends Player {

	public JiaZheng(Player asuccessor) {
		this.setSuccessor(asuccessor);
	}
	
	@Override
	public void handler() {
		if(DrumBeater.stopped) {
			System.out.println("Jia Zheng gotta drink");
		} else {
			System.out.println("Jia Zheng passed!");
			next();
		}


	}

}
