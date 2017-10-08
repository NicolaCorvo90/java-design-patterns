package com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightTest {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>(0);
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("White");
		colors.add("Black");
		
		for(int i = 0; i < 20; i++) {
			
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor(colors));
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(50);
			circle.draw();
			
		}

	}
	
	private static String getRandomColor(List<String> colors) {
		return colors.get((int)(Math.random()*colors.size()));
	}

	private static int getRandomX() {
		return (int)(Math.random()*100 );
	}
	
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}

}
