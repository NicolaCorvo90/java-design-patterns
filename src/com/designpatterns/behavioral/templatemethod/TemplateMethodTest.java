package com.designpatterns.behavioral.templatemethod;

public class TemplateMethodTest {

	public static void main(String[] args) {
		
		PurchaseOrderTemplate online = new OnlinePurchaseOrder();
		online.processOrder();
		
		System.out.println("\n\n------------------");
		System.out.println("------------------\n\n");
		
		PurchaseOrderTemplate store = new StorePurchaseOrder();
		store.processOrder();
		
	}

}
