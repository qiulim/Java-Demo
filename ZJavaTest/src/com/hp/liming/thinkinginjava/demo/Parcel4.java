package com.hp.liming.thinkinginjava.demo;

public class Parcel4 {

	private int var = 0;
	private void add () {
		
		var++;
	}
	
	private class innerParcel4 {
		public void invokeParcel4() {
			Parcel4 p4 = Parcel4.this;
			p4.add();
		}
		
		public void print() {
			System.out.println(var);
		}
	}
	
	public innerParcel4 innerParcel4() {return new innerParcel4();}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel4 p4 = new Parcel4();
		innerParcel4 ip4 = p4.innerParcel4();
		ip4.invokeParcel4();
		ip4.print();
	}

}
