package com.qiu.liming.designPattern.flyweight;

public class Client {

	//Âô³öµÄ¿§·È×ÜÊ?
	private static Order[] flavors = new Flavor[100];
	private static int ordersMade = 0;
	private static FlavorFactory flavorFactory;
	
	/**
	 * 
	 */
	private static void takeOrders(String aFlavor) {
		flavors[ordersMade++] = flavorFactory.getOrder(aFlavor);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		flavorFactory = new FlavorFactory();
		takeOrders("Black Coffee");
		takeOrders("Capucino");
		takeOrders("Espresso");
		takeOrders("Espresso");
		takeOrders("Capucino");
		takeOrders("Capucino");
		takeOrders("Black Coffee");
		
		for(int i=0;i<ordersMade;i++) {
			flavors[i].serve(new Table(i));
		}
		
		int a = flavorFactory.getTotalFlavorsMade();
		System.out.println("\nTotal teaFlavor objects made:" + a);

	}

}
