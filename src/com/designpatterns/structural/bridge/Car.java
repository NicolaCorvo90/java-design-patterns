package com.designpatterns.structural.bridge;

public class Car extends Vehicle {

	public Car(VehicleType type1, VehicleType type2) {
		super(type1, type2);
	}
	
	@Override
	public void purchase() {
		System.out.println("Car");
		type1.book();
		type2.book();
	}
	
}
