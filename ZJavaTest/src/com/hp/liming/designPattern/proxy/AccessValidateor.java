package com.hp.liming.designPattern.proxy;

public class AccessValidateor {

	public boolean validateUser(String user) {
		if ("admin".equals(user)) {
			return true;
		} else {
			return false;
		}
	}
}
