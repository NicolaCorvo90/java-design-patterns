package com.designpatterns.behavioral.visitor;

public interface ShoppingCartElement {

	public Double accept(ShoppingCartVisitor visitor);
	
}
