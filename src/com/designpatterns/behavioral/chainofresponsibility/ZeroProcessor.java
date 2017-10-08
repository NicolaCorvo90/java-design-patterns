package com.designpatterns.behavioral.chainofresponsibility;

public class ZeroProcessor implements Chain {

	private Chain nextInChain;
	
	@Override
	public void setNext(Chain nextInChain) {
		this.nextInChain = nextInChain;
	}

	@Override
	public void process(Number number) {
		
		if(number.getNumber() == 0) {
			System.out.println("ZeroProcessor : " + number.getNumber());
		} else {
			nextInChain.process(number);
		}
	}

}
