package com.qiu.liming.designPattern.proxy;

public class ProxyResearch implements Seacher {

	private String userId;
	private AccessValidateor av;
	private UsageLogger ul;
	private RealResearch rr;
	
	public ProxyResearch(String userId) {
		this.userId = userId;
		av = new AccessValidateor();
		ul = new UsageLogger();
		rr = new RealResearch();
	}
	
	private boolean preResearch() {
		return av.validateUser(userId);
	}
	
	private void postResearch() {
		ul.save(userId);
	}
	
	@Override
	public void doResearch() {
		
		if(preResearch()) {
			rr.doResearch();
		}
		
		postResearch();
	}

}
