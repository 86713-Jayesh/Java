package com.app.fruits;

class Mango extends Fruit{
	
	public Mango(){
		super("Mango");
	}
	@Override
	public String taste() {
		return "Sweet";
	}
	@Override
	public String toString() {
		return "Mango [taste()=" + taste() + ", getName()=" + getName() + ", getColor()=" + getColor()
				+ ", getWeight()=" + getWeight() + ", isFresh()=" + isFresh() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
