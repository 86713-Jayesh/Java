package com.java.assignment02;

import java.util.Scanner;

public class Assignment02_b {

    public static void main(String[] args) {
        Scanner food = new Scanner(System.in);
        int totalBill = 0;
        int choice;
        int quantity;
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Dosa - Rs. 50");
            System.out.println("2. Samosa - Rs. 10");
            System.out.println("3. Idli - Rs. 30");
            System.out.println("4. Generate Bill");
            System.out.print("Enter your choice: ");
            choice = food.nextInt();

            if (choice == 4) {
              
                break;
            }

           
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
            quantity = food.nextInt();

            switch (choice) {
                case 1:
                    totalBill += 50 * quantity;
                    break;
                case 2:
                    totalBill += 10 * quantity;
                    break;
                case 3:
                    totalBill += 30 * quantity;
                    break;
            }
        }

  
        System.out.println("Total Bill is Rs. " + totalBill);
        food.close();
    }
}
