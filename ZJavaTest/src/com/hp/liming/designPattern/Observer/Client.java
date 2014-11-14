package com.hp.liming.designPattern.Observer;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		cs.attact(new ConcreteObserver("observer1"));
		cs.attact(new ConcreteObserver("observer2"));
		cs.attact(new ConcreteObserver("observer3"));
		
		cs.notifyObserver();
		

	}

}
