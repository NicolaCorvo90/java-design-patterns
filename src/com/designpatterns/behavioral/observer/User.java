package com.designpatterns.behavioral.observer;

public class User implements Observer {

	private String article;
	private Subject blog;
	
	@Override
	public void update() {
		System.out.println("State change reported by Subject");
		this.article = (String) blog.getUpdate();
	}

	@Override
	public void setSubject(Subject blog) {
		this.blog = blog;
		this.article = "No new Article!";
	}
	
	public String getArticle() {
		return this.article;
	}

}
