package com.hp.liming.designPatternState;

public interface IWallstate {

	void spell(WallEntry wall, String spell) throws WallEntryException;
	void pass(WallEntry wall) throws WallEntryException;
}
