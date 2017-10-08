package com.designpatterns.behavioral.chainofresponsibility;

public class PositiveNumberProcessor implements Chain {

	private Chain nextInChain;
	
	@Override
	public void setNext(Chain nextInChain) {
		this.nextInChain = nextInChain;
	}

	@Override
	public void process(Number number) {
		
		if(number.getNumber() > 0) {
			System.out.println("PositiveNumberProcessor : " + number.getNumber());
		} else {
			nextInChain.process(number);
		}
	}

}
