package com.hp.liming.designPatternState;

import java.util.Date;

public class UnlockedState implements IWallstate {

	private Date timeOfLock;
	public Date getTimeOfLock() {
		return timeOfLock;
	}

	public void setTimeOfLock(Date timeOfLock) {
		this.timeOfLock = timeOfLock;
	}

	
	@Override
	public void spell(WallEntry wall, String spell) throws WallEntryException {
		// TODO Auto-generated method stub

	}

	@Override
	public void pass(WallEntry wall) throws WallEntryException {
		wall.setState(new LockedState());

	}

}
