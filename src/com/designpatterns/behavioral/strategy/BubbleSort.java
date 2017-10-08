package com.designpatterns.behavioral.strategy;

import java.util.List;

public class BubbleSort implements Strategy {

	@Override
	public void sort(List<Integer> numbers) {
		
		Boolean scambio = Boolean.TRUE;
		
		Integer n = numbers.size() - 1;
		
		while(scambio) {
			scambio = Boolean.FALSE;
			
			for(int i = 0;i < n;i++) {
				if(numbers.get(i) > numbers.get(i+1)) {
					Integer temp = numbers.get(i);
					
					numbers.set(i, numbers.get(i+1));
					numbers.set(i+1, temp);
					
					scambio = Boolean.TRUE;
				}
			}
			
			n = n - 1;
		}
	}
	
}
