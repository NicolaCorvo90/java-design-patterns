package com.designpatterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityTest {

	public static void main(String[] args) {
		
		Chain chain1 = new NegativeNumberProcessor();
		Chain chain2 = new ZeroProcessor();
		Chain chain3 = new PositiveNumberProcessor();
		
		chain1.setNext(chain2);
		chain2.setNext(chain3);
		
		chain1.process(new Number(-5));
		chain1.process(new Number(0));
		chain1.process(new Number(5));
	}
	
}
