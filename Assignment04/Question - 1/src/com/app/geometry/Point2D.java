package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	
	double x;
	double y;
	public Point2D(double x, double y) {
	
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
		return "X : "+this.x+" and Y : "+this.y;
	}
	public boolean isEqual(Point2D p2)
	{
		return this.x==p2.x && this.y==p2.y;
	}
	public double calculateDistance(Point2D p2) {
		if(this.isEqual(p2))
		{
			return 0;
		}
		double distance = Math.sqrt(Math.pow((this.x-p2.x), 2)+Math.pow(this.y-p2.y, 2));
		return distance;
	}
	public void accept() {
		System.out.print("Enter the X-Coordinate : ");
		Scanner scan=new Scanner(System.in);
		this.x=scan.nextDouble();
		System.out.print("Enter the Y-Coordinate : ");
		this.y=scan.nextDouble();
	}
	
}
