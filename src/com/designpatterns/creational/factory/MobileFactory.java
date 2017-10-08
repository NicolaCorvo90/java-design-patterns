package com.designpatterns.creational.factory;

public class MobileFactory {

	public IMobile createMobile(String manufacturer) {
		
		IMobile mobile = null;
		
		switch (manufacturer.toUpperCase()) {
			case "SAMSUNG":
				mobile = new Samsung();
				break;
			case "LG":
				mobile = new Lg();
				break;
			default:
				mobile = new Samsung();
				break;
		}
		
		return mobile;
	}
	
}
