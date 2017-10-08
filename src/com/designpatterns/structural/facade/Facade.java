package com.designpatterns.structural.facade;

public class Facade {

	public int calculation1(int x) {
		ClassA classA = new ClassA();
		return classA.doSomething(x);
	}
	
	public int calculation2(int x) {
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		return classB.doSomething(x, classA);
	}
	
	public int calculation3(int x) {
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		ClassC classC = new ClassC();
		return classC.doSomething(x, classA, classB);
	}
	
}
