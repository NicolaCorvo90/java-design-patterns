package com.designpatterns.behavioral.templatemethod;

public class OnlinePurchaseOrder extends PurchaseOrderTemplate {

	@Override
	public void doSelect() {
		System.out.println("Item added to online cart");
		System.out.println("Gift wrap selected");
		System.out.println("Delivery address selected");
	}

	@Override
	public void doPayment() {
		System.out.println("Item paid through PayPal");
	}

	@Override
	public void doDelivery() {
		System.out.println("Item shipped");
	}

	
	
}
