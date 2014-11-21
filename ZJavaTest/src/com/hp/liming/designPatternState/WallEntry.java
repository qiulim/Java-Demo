package com.hp.liming.designPatternState;

public class WallEntry {
	private IWallstate state;

	public IWallstate getState() {
		return state;
	}

	public void setState(IWallstate state) {
		this.state = state;
	}
	
	public void pass() throws WallEntryException{
		state.pass(this);
	}
	
	public void spell(String spell) throws WallEntryException{
		state.spell(this, spell);
	}
	
}
