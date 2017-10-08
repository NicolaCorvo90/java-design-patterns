package com.designpatterns.creational.abstractfactory;

public class LgMobileFactory extends MobileFactory{

	public Lg createLgMobile() {
		return new Lg();
	}
	
}
