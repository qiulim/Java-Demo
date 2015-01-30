package com.qiu.liming.thinkinginjava.demo;

import com.qiu.liming.thinkinginjava.demo.interfacer.Game;
import com.qiu.liming.thinkinginjava.demo.interfacer.GameFactory;

public class GameChess implements Game {

	private GameChess() {};
	private int moves = 0;
	
	@Override
	public boolean move() {
		System.out.println("GameChess move " + moves);
		return ++moves != MOVE ;
	}


	public static GameFactory factory = new GameFactory() {
		
		@Override
		public Game getGame() {
			return new GameChess();
		}
	};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
