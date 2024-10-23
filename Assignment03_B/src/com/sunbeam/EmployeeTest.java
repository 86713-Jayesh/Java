package com.sunbeam;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
System.out.println("Enter the First employee details : ");
		
		System.out.println("Enter the first name : ");
		String firstName=scan.nextLine();
		
		System.out.println("Enter the second name : ");
		String secondName=scan.nextLine();
		
		System.out.println("Enter the monthly salary.");
		double monthlySalary=scan.nextDouble();
		
		Employee employee1=new Employee(firstName,secondName,monthlySalary);
		
		System.out.println("Employee 1 ");
		System.out.println("Before raise : "+employee1.getMonthlySalary());
		employee1.raiseSalaryByTenPercent();
		System.out.println("After raise : "+employee1.getMonthlySalary());
		
		scan.nextLine();
		
		System.out.println("\n\nEnter the Second employee details : ");
		
		System.out.println("Enter the first name : ");
		firstName=scan.nextLine();
		
		System.out.println("Enter the second name : ");
		secondName=scan.nextLine();
		
		System.out.println("Enter the monthly salary.");
		monthlySalary=scan.nextDouble();

		Employee employee2=new Employee(firstName,secondName,monthlySalary);

		System.out.println("Employee 2 ");
		System.out.println("Before raise : "+employee2.getMonthlySalary());
		employee2.raiseSalaryByTenPercent();
		System.out.println("After raise : "+employee2.getMonthlySalary());
	
		
	}

}

