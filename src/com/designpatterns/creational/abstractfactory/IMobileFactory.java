package com.designpatterns.creational.abstractfactory;

public interface IMobileFactory {

	IMobileFactory createMobile(String manufacturer);
	
}
