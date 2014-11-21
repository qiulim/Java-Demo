package com.hp.liming.designPatternState;

import java.util.Date;

public class LockedState implements IWallstate {

	private Date timeOfLock;
	public Date getTimeOfLock() {
		return timeOfLock;
	}

	public void setTimeOfLock(Date timeOfLock) {
		this.timeOfLock = timeOfLock;
	}

	protected static String rightSpell = "天机不可泄露！！·";
	public LockedState(){
		this.setTimeOfLock(new Date());
	}
	
	@Override
	public void spell(WallEntry wall, String spell) throws WallEntryException {
		if(spell.equals(this.rightSpell)) {
			wall.setState(new UnlockedState());
		} else {
			throw new WallEntryException("Wrong spell");
		}

	}

	@Override
	public void pass(WallEntry wall) throws WallEntryException {
		throw new WallEntryException("bang!!");

	}

}
