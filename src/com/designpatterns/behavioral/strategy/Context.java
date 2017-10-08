package com.designpatterns.behavioral.strategy;

import java.util.List;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void sort(List<Integer> input) {
		strategy.sort(input);
	}
	
}
