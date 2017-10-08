package com.designpatterns.structural.facade;

public class FacadeTest {

	public static void main(String[] args) {
		
		Facade facade = new Facade();
		
		int x = 5;
		
		System.out.println("Calculation 1");
		System.out.println("Result: " + facade.calculation1(x));
		System.out.println("-------------");
		
		System.out.println("Calculation 2");
		System.out.println("Result: " + facade.calculation2(x));
		System.out.println("-------------");
		
		System.out.println("Calculation 3");
		System.out.println("Result: " + facade.calculation3(x));
		System.out.println("-------------");
		
	}

}
