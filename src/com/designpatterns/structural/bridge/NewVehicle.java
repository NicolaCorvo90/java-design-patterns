package com.designpatterns.structural.bridge;

public class NewVehicle implements VehicleType {

	@Override
	public void book() {
		System.out.println("New Vehicle");
	}

}
