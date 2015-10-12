package com.qiu.liming.CashFactory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CashSuper cs = CashFactory.createCashSuper(Const.OriginPrice);
		printPrice(cs.accetpCash(400));
		
		cs = CashFactory.createCashSuper(Const.ReturnMoney);
		printPrice(cs.accetpCash(400));
		
		cs = CashFactory.createCashSuper(Const.ThreePCut);
		printPrice(cs.accetpCash(400));
	}
	
	private static void printPrice(double price) {
		System.out.println("current price is : " + price);
	}

}
