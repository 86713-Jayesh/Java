package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		super("Orange");
	}
	


	@Override
	public String toString() {
		return "Orange [taste()=" + taste() + ", getName()=" + getName() + ", getColor()=" + getColor()
				+ ", getWeight()=" + getWeight() + ", isFresh()=" + isFresh() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	@Override
	public String taste() {
		return "Sour";
	}
}
