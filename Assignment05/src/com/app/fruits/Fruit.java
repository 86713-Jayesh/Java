package com.app.fruits;

import java.util.Scanner;

abstract class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh=true;
	Fruit(String name)
	{
		this.name=name;
	}
	abstract String taste();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public void accept(Scanner scan) {
		System.out.println("Enter the weight");
		setWeight(scan.nextDouble());
		System.out.println("Enter the color");
		scan.nextLine();
		setColor(scan.nextLine());
	}
}
