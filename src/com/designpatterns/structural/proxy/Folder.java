package com.designpatterns.structural.proxy;

public class Folder implements IFolder {

	@Override
	public void performOperations() {
		System.out.println("Operations on folder");
	}

}
