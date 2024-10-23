package com.app.tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

	  //Tester
		Point2D p1=new Point2D(1,2);
		System.out.println(p1.getDetails());
		
		Point2D p2=new Point2D(3,4);
		System.out.println(p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("Yes p1 and p2 are equal");
		}
		System.out.println("Enter the p1 coordinates ");
		p1.accept();
		System.out.println("Enter the p2 coordinates ");
		p2.accept();
		
		double distance=p1.calculateDistance(p2);
	
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
	
		if(distance==0)
		{
			System.out.println("They are at the same position and distance between them is 0.0");
		}else {
			System.out.println("The distance between the above two coordinates are "+distance);	
		}
		
	}

}
