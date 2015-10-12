package com.qiu.liming.CashFactory;

public class CashReturn implements CashSuper {

	private double atLeastMoney = 0;
	private double returnMoney = 0;
	
	CashReturn(double atleastMoney,double returnMoney) {
		this.atLeastMoney = atleastMoney;
		this.returnMoney = returnMoney;
	}
	
	@Override
	public double accetpCash(double money) {
		int mutiple = (int)( money / atLeastMoney);
		
		if(mutiple > 0)
		  return (money - mutiple*returnMoney);
		else 
			
		return money;
	}

}
