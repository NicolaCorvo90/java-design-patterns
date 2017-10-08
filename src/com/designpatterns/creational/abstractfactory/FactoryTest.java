package com.designpatterns.creational.abstractfactory;

public class FactoryTest {

	public static void main(String[] args) {
		
		MobileFactory factory = new MobileFactory();
		
		SamsungMobileFactory samsungFactory = (SamsungMobileFactory) factory.createMobile("samsung");
		
		Samsung samsung = (Samsung) samsungFactory.createSamsungMobile();
		
		
		LgMobileFactory lgFactory = (LgMobileFactory) factory.createMobile("lg");
		
		Lg lg = (Lg) lgFactory.createLgMobile();
		
		samsung.cost();
		samsung.batteryCapacity();
		
		System.out.println();
		System.out.println();
		
		lg.cost();
		lg.batteryCapacity();
		
	}

}
