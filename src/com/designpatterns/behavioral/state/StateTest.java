package com.designpatterns.behavioral.state;

public class StateTest {

	public static void main(String[] args) {
		
		MobileContext context = new MobileContext(new Ringing());
		
		context.getState();
		
		context = new MobileContext(new Vibration());
		
		context.getState();
		
		context = new MobileContext(new Silent());
		
		context.getState();
	}
}
