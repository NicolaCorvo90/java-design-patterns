package com.designpatterns.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		SingletonClass instance = SingletonClass.getInstance();
		
		System.out.println(instance);

	}

}
