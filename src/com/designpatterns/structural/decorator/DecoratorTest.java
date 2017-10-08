package com.designpatterns.structural.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		IceCream iceCream = new HoneyDecorator(new NuttyDecorator(new SimpleIceCream()));
		
		System.out.println(iceCream.makeIceCream());
	}

}
