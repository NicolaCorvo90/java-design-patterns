package com.designpatterns.structural.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		
		User user = new User("dev", "root");
		
		FolderProxy folderProxy = new FolderProxy(user);
		
		folderProxy.performOperations();

	}

}
