package com.designpatterns.behavioral.visitor;

public interface ShoppingCartVisitor {

	Double visit(Book book);
	Double visit(Fruit fruit);
	
}
