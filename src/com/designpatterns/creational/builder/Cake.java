package com.designpatterns.creational.builder;

public class Cake {
	
	private final double sugar;
	private final double butter;
	private final double milk;
	private final double cherry;
	
	public static class CakeBuilder {
		private double sugar;
		private double butter;
		private double milk;
		private double cherry;
		
		public CakeBuilder sugar(double sugar) {
			this.sugar = sugar;
			return this;
		}
		
		public CakeBuilder butter(double butter) {
			this.butter = butter;
			return this;
		}
		
		public CakeBuilder milk(double milk) {
			this.milk = milk;
			return this;
		}
		
		public CakeBuilder cherry(double cherry) {
			this.cherry = cherry;
			return this;
		}
		
		public Cake build() {
			return new Cake(this);
		}
	}
	
	private Cake(CakeBuilder builder) {
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.milk = builder.milk;
		this.cherry = builder.cherry;
	}

	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", milk=" + milk + ", cherry=" + cherry + "]";
	}
	
}
