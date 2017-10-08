package com.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(0);
		
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		
		Context context = new Context(new BubbleSort());
		//Context context = new Context(new InsertionSort());
		context.sort(list);
		
		
	}

}
