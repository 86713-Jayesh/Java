package com.assignment;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		try {
			String str;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the string");
			str=scan.nextLine();
			if(str.length()>=80)
			{
				throw new ExceptionLineTooLong("The strings is too long.");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
