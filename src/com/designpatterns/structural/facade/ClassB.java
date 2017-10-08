package com.designpatterns.structural.facade;

public class ClassB {

	public int doSomething(int x, ClassA classA) {
		return x * classA.doSomething(x);
	}
	
}
