package com.designpatterns.creational.factory;

public class Samsung implements IMobile {

	@Override
	public void cost() {
		System.out.println("Samsung costs 1000€");
	}

	@Override
	public void batteryCapacity() {
		System.out.println("Samsung battery capacity is 3000mAh");
	}

}
