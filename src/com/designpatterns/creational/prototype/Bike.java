package com.designpatterns.creational.prototype;

public class Bike implements Cloneable {

	private int gears;
	private String bikeType;
	private String model;
	
	public Bike() {
		this.gears = 1;
		this.bikeType = "Standard";
		this.model = "BMX";
	}
	
	public Bike clone() {
		try {
			Bike bike = (Bike) super.clone();
			return bike;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public void makeAdvancedBike() {
		this.gears = 18;
		this.bikeType = "Advanced";
		this.model = "Stratos";
	}

	@Override
	public String toString() {
		return "Bike [gears=" + gears + ", bikeType=" + bikeType + ", model=" + model + "]";
	}

	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getBikeType() {
		return bikeType;
	}
	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
