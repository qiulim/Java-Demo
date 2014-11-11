package com.hp.liming.thinkinginjava.demo;

import com.hp.liming.thinkinginjava.demo.interfacer.Game;
import com.hp.liming.thinkinginjava.demo.interfacer.GameFactory;

public class GameChecker implements Game {

	private GameChecker(){};
	private int moves = 0;
	
	@Override
	public boolean move() {
		System.out.println("gamechecker move " + moves);
		return ++moves != MOVE ;
	}
	
	public static GameFactory factory = new GameFactory() {
		
		@Override
		public Game getGame() {
			return new GameChecker();
		}
	};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
