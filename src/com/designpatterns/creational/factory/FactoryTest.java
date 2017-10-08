package com.designpatterns.creational.factory;

public class FactoryTest {

	public static void main(String[] args) {
		
		MobileFactory factory = new MobileFactory();
		
		Samsung samsung = (Samsung) factory.createMobile("samsung");
		
		Lg lg = (Lg) factory.createMobile("Lg");
		
		samsung.cost();
		samsung.batteryCapacity();
		
		System.out.println();
		System.out.println();
		
		lg.cost();
		lg.batteryCapacity();
		
	}

}
