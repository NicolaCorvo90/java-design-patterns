package com.designpatterns.behavioral.visitor;

public class Fruit implements ShoppingCartElement {

	private Double pricePerkG;
	private Double weight;
	private String name;
	
	public Fruit(Double pricePerKg, Double weight, String name) {
		this.pricePerkG = pricePerKg;
		this.weight = weight;
		this.name = name;
	}
	
	public Double getPricePerkG() {
		return pricePerkG;
	}

	public Double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public Double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
