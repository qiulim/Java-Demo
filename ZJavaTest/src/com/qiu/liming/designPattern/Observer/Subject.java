package com.qiu.liming.designPattern.Observer;

public interface Subject {

	public void attact(Observer observer);
	public void detact(Observer observer);
	public void notifyObserver();
}
