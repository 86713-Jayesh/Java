package com.java.assignment01;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: First input is not a double.");
            return;
        }
        
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        if (!scanner.hasNextDouble()) 
        {
            System.out.println("Error: Second input is not a double.");
            return;
        }
        
        double num2 = scanner.nextDouble();

        double average = (num1 + num2) / 2;
        System.out.println("The average is: " + average);
    }
}
