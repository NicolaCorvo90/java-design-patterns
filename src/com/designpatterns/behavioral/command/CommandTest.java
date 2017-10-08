package com.designpatterns.behavioral.command;

public class CommandTest {

	public static void main(String[] args) {
		
		Lunch lunch = new Lunch();
		Command lunchCommand = new LunchCommand(lunch);
		
		Dinner dinner = new Dinner();
		Command dinnerCommand = new DinnerCommand(dinner);
		
		MealInvoker mealInvoker = new MealInvoker(lunchCommand);
		mealInvoker.invoke();
		
		mealInvoker.setCommand(dinnerCommand);
		mealInvoker.invoke();
		
	}

}
