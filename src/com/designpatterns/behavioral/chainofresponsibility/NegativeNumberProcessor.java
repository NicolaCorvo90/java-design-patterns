package com.designpatterns.behavioral.chainofresponsibility;

public class NegativeNumberProcessor implements Chain {

	private Chain nextInChain;
	
	@Override
	public void setNext(Chain nextInChain) {
		this.nextInChain = nextInChain;
	}

	@Override
	public void process(Number number) {
		
		if(number.getNumber() < 0) {
			System.out.println("NegativeNumberProcessor : " + number.getNumber());
		} else {
			nextInChain.process(number);
		}
	}

}
