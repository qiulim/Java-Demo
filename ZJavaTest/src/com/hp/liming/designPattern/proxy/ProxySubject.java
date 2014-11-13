package com.hp.liming.designPattern.proxy;

public class ProxySubject  extends Subject {

	private RealSubject rs;
	
	public ProxySubject(RealSubject rs){
		this.rs = rs;
	}
	
	private void preRequest(){
		System.out.println("preRequest()!!!");
	}

	private void postRequest() {
		System.out.println("postRequest()!!!");
	}
	
	@Override
	public void request() {
		preRequest();
		rs.request();
		postRequest();
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
