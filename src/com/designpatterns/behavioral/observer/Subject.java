package com.designpatterns.behavioral.observer;

public interface Subject {

	public void registerObserver(Observer observer);
	public void notifyObserver();
	public void unregisterObserver(Observer observer);
	public Object getUpdate();
	
}
