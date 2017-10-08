package com.designpatterns.behavioral.strategy;

import java.util.List;

public class InsertionSort implements Strategy {

	@Override
	public void sort(List<Integer> numbers) {
		
		int j = 0;
		
		for(int i = 1; i < numbers.size(); i++) {
			Integer value = numbers.get(i);
			
			j = i - 1;
			
			while(j >= 0 && numbers.get(j) >= value) {
				
				numbers.set(j+1, numbers.get(j));
				j = j - 1;
			}
			
			numbers.set(j+1, value);
			
		}
		
	}
	
}
