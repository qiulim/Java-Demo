package com.qiu.liming.CashFactory;

public class CashRebate implements CashSuper {

	private double rate = 1;
	
	CashRebate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public double accetpCash(double money) {
		return money  * this.rate;
	}

}
