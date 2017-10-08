package com.designpatterns.behavioral.visitor;

public class Book implements ShoppingCartElement {

	private Double price;
	private String isbnNumber;
	
	public Book(Double price, String isbn) {
		this.price = price;
		this.isbnNumber = isbn;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public String getIsbnNumber() {
		return this.isbnNumber;
	}
	
	@Override
	public Double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
