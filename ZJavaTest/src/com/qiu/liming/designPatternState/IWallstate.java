package com.qiu.liming.designPatternState;

public interface IWallstate {

	void spell(WallEntry wall, String spell) throws WallEntryException;
	void pass(WallEntry wall) throws WallEntryException;
}
