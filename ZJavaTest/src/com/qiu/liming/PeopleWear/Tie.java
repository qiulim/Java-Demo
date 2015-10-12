package com.qiu.liming.PeopleWear;

public class Tie implements IDecorate {

	IComponent oriComponent = null;
	
	public Tie(IComponent ic) {
		oriComponent = ic;
	}
	@Override
	public void showWearing() {
		if (oriComponent != null) {
			oriComponent.showWearing();
			addedBehavior();
		}

	}

	@Override
	public void setComponent(IComponent icom) {
		oriComponent = icom;

	}

	@Override
	public void addedBehavior() {
		System.out.println("多系了根领带");

	}

}
