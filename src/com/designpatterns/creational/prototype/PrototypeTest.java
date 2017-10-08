package com.designpatterns.creational.prototype;

public class PrototypeTest {
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		
		Bike advancedBike = bike.clone();
		
		advancedBike.makeAdvancedBike();
		
		System.out.println("Basic bike : ");
		System.out.println(bike);
		System.out.println();
		System.out.println();
		System.out.println("Advanced bike : ");
		System.out.println(advancedBike);
	}

}
