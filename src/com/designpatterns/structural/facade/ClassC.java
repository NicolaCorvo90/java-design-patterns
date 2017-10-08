package com.designpatterns.structural.facade;

public class ClassC {

	public int doSomething(int x, ClassA classA, ClassB classB) {
		return x * classA.doSomething(x) * classB.doSomething(x, classA);
	}
	
}
