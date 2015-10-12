package com.qiu.liming.PeopleWear;

public interface IDecorate extends IComponent {
	public void showWearing();
	
	public void setComponent(IComponent icom);
	
	public void addedBehavior();
}
