package com.hp.liming.designPattern.Observer;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ConcreteSubject implements Subject {

	private Vector<Observer> observers = new Vector<Observer>();
	
	@Override
	public void attact(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detact(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObserver() {
		Iterator it = observers.iterator();
		while(it.hasNext()) {
			Observer tempObserver  = (Observer)it.next();
			tempObserver.update();
		}

	}
	
	private Enumeration observers() {
		return ((Vector) observers.clone()).elements();
	}
}
