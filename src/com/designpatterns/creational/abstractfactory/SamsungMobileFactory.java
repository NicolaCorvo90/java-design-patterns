package com.designpatterns.creational.abstractfactory;

public class SamsungMobileFactory extends MobileFactory{

	public Samsung createSamsungMobile() {
		return new Samsung();
	}
	
}
