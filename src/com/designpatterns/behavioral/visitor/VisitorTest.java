package com.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {

	public static void main(String[] args) {
		
		List<ShoppingCartElement> items = new ArrayList<ShoppingCartElement>(0);
		
		items.add(new Book(20.0, "1234"));
		items.add(new Book(100.0, "5678"));
		items.add(new Fruit(4.0, 4.0, "Apple"));
		items.add(new Fruit(8.0, 8.0, "Banana"));
		
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		Double total = 0.0;
		
		for (ShoppingCartElement shoppingCartElement : items) {
			total = total + shoppingCartElement.accept(visitor);
		}
		
		System.out.println("Total : " + total);
	}

}
