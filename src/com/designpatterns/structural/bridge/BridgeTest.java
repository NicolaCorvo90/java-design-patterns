package com.designpatterns.structural.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Car(new NewVehicle(), new OldVehicle());
		vehicle1.purchase();
		
		Vehicle vehicle2 = new Bike(new NewVehicle(), new OldVehicle());
		vehicle2.purchase();
	}

}
