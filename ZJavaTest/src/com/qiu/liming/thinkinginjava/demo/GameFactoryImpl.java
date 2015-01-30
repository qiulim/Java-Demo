package com.qiu.liming.thinkinginjava.demo;

import com.qiu.liming.thinkinginjava.demo.interfacer.Game;
import com.qiu.liming.thinkinginjava.demo.interfacer.GameFactory;

public class GameFactoryImpl{

	public static void playGame(GameFactory factory) {
		Game game = factory.getGame();
		while(game.move()) {
			;
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		playGame(GameChecker.factory);
		playGame(GameChess.factory);

	}

}
