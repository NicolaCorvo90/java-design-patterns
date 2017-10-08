package com.designpatterns.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public Double visit(Book book) {
		Double cost = 0.0;
		
		if(book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else {
			cost = book.getPrice();
		}
		
		System.out.println("Book ISBN : " + book.getIsbnNumber() + " , cost : " + cost);
		
		return cost;
	}

	@Override
	public Double visit(Fruit fruit) {
		Double cost = fruit.getPricePerkG() * fruit.getWeight();
		
		System.out.println("Fruit : " + fruit.getName() + ", cost : " + cost);
		
		return cost;
	}

}
