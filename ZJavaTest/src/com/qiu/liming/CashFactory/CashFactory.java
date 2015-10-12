package com.qiu.liming.CashFactory;

public class CashFactory {

	public static CashSuper createCashSuper(String cashKind) {
		CashSuper cs = null;
		
		String kind = cashKind;
		switch (kind) {
		   case Const.OriginPrice: 
			   cs = new CashNomal();
			   break;
		   case Const.ThreePCut:
			   cs = new CashRebate(0.7);
			   break;
		   case Const.ReturnMoney:
			   cs = new CashReturn(300,80);
			   break;
		}
		
		return cs;
	}
}
