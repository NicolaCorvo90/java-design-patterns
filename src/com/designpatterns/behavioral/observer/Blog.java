package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {

	List<Observer> observersList;
	private Boolean stateChange;
	
	
	public Blog() {
		this.observersList = new ArrayList<Observer>();
		this.stateChange = Boolean.FALSE;
	}
	@Override
	public void registerObserver(Observer observer) {
		observersList.add(observer);
	}

	@Override
	public void notifyObserver() {
		if(this.stateChange) {
			for(Observer observer : observersList) {
				observer.update();
				System.out.println("Observer notified!");
			}
		}
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observersList.remove(observer);
	}

	@Override
	public Object getUpdate() {
		Object changedState = null;
		
		if(this.stateChange) {
			changedState = "Observer Design Pattern";
		}
		return changedState;
	}
	
	public void postNewArticle() {
		this.stateChange = true;
		notifyObserver();
	}

}
