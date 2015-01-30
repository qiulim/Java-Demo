package com.qiu.liming.designPattern.chainOfResponsibility;

import java.util.Timer;
import java.util.TimerTask;

public class DrumBeater {

	private static Player firstPlayer;
	public static boolean stopped = false;
	Timer timer;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DrumBeater drumBeater = new DrumBeater();
		JiaMu jiaMu = new JiaMu(null);
		jiaMu.setSuccessor(new JiaShe(new JiaZheng(new JiaBaoYu(new JiaHuan(jiaMu)))));
		drumBeater.startBeatig(1);
		firstPlayer = jiaMu;
		firstPlayer.handler();

	}
	
	public void startBeatig(int stopInSeconds) {
		System.out.println("drum beating started...");
		timer = new Timer();
		timer.schedule(new StopBeatingReminder(), stopInSeconds*10);
	} 

	class StopBeatingReminder extends TimerTask{

		@Override
		public void run() {
			System.out.println("drum beating stopped...");

			stopped = true;
			timer.cancel();
		}
		
	}
}
