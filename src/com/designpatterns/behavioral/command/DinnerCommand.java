package com.designpatterns.behavioral.command;

public class DinnerCommand implements Command {

	private Dinner dinner;

	public DinnerCommand(Dinner dinner) {
		this.dinner = dinner;
	}
	
	@Override
	public void execute() {
		dinner.makeDinner();
	}

}
