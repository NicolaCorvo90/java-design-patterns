package com.designpatterns.structural.proxy;

public class FolderProxy implements IFolder {

	private User user;
	
	public FolderProxy(User user) {
		this.user = user;
	}
	
	@Override
	public void performOperations() {
		if(user.getUsername().equalsIgnoreCase("dev")) {
			Folder folder = new Folder();
			folder.performOperations();
		} else {
			System.out.println("Permission denied");
		}
	}

}
