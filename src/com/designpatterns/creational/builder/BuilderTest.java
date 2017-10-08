package com.designpatterns.creational.builder;

import com.designpatterns.creational.builder.Cake.CakeBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		
		CakeBuilder cakeBuilder = new Cake.CakeBuilder();
		cakeBuilder.sugar(1);
		cakeBuilder.butter(2);
		cakeBuilder.milk(3);
		cakeBuilder.cherry(4);
		
		Cake cake = cakeBuilder.build();

		System.out.println(cake);
		
	}

}
