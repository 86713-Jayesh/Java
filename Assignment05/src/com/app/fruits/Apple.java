package com.app.fruits;

class Apple extends Fruit{

	public Apple(){
		super("Apple");	
	}
	

	@Override
	public String toString() {
		return "Apple [taste()=" + taste() + ", getName()=" + getName() + ", getColor()=" + getColor()
				+ ", getWeight()=" + getWeight() + ", isFresh()=" + isFresh() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	public String taste() {
		return "Sweet and sour.";
	}
}
