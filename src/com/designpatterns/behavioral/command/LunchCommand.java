package com.designpatterns.behavioral.command;

public class LunchCommand implements Command {

	private Lunch lunch;

	public LunchCommand(Lunch lunch) {
		this.lunch = lunch;
	}
	
	@Override
	public void execute() {
		lunch.makeLunch();
	}

}
