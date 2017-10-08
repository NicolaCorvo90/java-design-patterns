package com.designpatterns.structural.decorator;

public class IceCreamDecorator implements IceCream {

	protected IceCream specialIceCream;
	
	public IceCreamDecorator(IceCream specialIceCream) {
		this.specialIceCream = specialIceCream;
	}
	
	@Override
	public String makeIceCream() {
		return specialIceCream.makeIceCream();
	}

}
