package com.designpatterns.creational.factory;

public class Lg implements IMobile {

	@Override
	public void cost() {
		System.out.println("Lg costs 900€");
	}

	@Override
	public void batteryCapacity() {
		System.out.println("Lg battery capacity is 2800mAh");
	}

}
