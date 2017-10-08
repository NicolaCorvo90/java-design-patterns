package com.designpatterns.structural.composite;

public class CompositeTest {

	public static void main(String[] args) {
		
		Employee developer1 = new Developer("Developer1", 20000.00);
		Employee developer2 = new Developer("Developer2", 15000.00);
		
		Employee manager1 = new Manager("Manager1", 45000.00);
		manager1.add(developer1);
		manager1.add(developer2);
		
		Employee generalManager = new Manager("GeneralManager", 100000.00);
		generalManager.add(manager1);
		
		generalManager.print();
	}

}
