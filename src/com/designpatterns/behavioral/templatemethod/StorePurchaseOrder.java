package com.designpatterns.behavioral.templatemethod;

public class StorePurchaseOrder extends PurchaseOrderTemplate {

	@Override
	public void doSelect() {
		System.out.println("An item is selected");
	}

	@Override
	public void doPayment() {
		System.out.println("Item paid through Cash");
	}

	@Override
	public void doDelivery() {
		System.out.println("Item delivered");
	}

}
