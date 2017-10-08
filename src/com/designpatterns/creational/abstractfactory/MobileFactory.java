package com.designpatterns.creational.abstractfactory;

public class MobileFactory implements IMobileFactory {

	public IMobileFactory createMobile(String manufacturer) {
		
		IMobileFactory mobile = null;
		
		switch (manufacturer.toUpperCase()) {
			case "SAMSUNG":
				mobile = new SamsungMobileFactory();
				break;
			case "LG":
				mobile = new LgMobileFactory();
				break;
			default:
				mobile = new SamsungMobileFactory();
				break;
		}
		
		return mobile;
	}
	
}
