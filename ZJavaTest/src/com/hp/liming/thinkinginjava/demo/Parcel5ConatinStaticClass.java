package com.hp.liming.thinkinginjava.demo;

public class Parcel5ConatinStaticClass {

	public void f() {
		System.out.println("f()");
	}
	
	public static class TestBed{
		public static void main(String[] args) {
			Parcel5ConatinStaticClass p5 = new Parcel5ConatinStaticClass();
			p5.f();
		}
	}
	
}
