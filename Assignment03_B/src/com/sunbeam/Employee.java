package com.sunbeam;

public class Employee {
String firstName;
String lastName;
double monthlySalary;
public Employee(String firstName, String lastName, double monthlySalary) {

	this.firstName = firstName;
	this.lastName = lastName;
 setMonthlySalary(monthlySalary);
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getMonthlySalary() {
	return monthlySalary;
}
public void setMonthlySalary(double monthlySalary) {
	if(monthlySalary>=0)
		this.monthlySalary = monthlySalary;
		
}
public double getYearlySalary() {
	return this.monthlySalary*12.0;
}

public void raiseSalaryByTenPercent() {
	this.monthlySalary*=1.1;
}


}
