package com.qiu.liming.PeopleWear;

public class Cap implements IDecorate {

	IComponent oriComponent = null;
	
	public Cap(IComponent ic) {
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
		System.out.println("多带了一个帽子");
		
	}

}
