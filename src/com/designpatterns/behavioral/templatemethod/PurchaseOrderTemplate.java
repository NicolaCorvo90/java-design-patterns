package com.designpatterns.behavioral.templatemethod;

public abstract class PurchaseOrderTemplate {

	public abstract void doSelect();
	
	public abstract void doPayment();
	
	public final void processOrder() {
		doSelect();
		doPayment();
		doPack();
		doDelivery();
	}
	
	public abstract void doDelivery();
	
	public final void doPack() {
		System.out.println("Gift wrapped.");
	}
	
	
	
}
