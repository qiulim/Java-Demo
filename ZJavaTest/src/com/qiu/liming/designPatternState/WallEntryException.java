package com.qiu.liming.designPatternState;

public class WallEntryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WallEntryException(String msg) {
		super(msg);
		System.out.println(msg);
	}
	
}
