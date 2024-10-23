package com.palindrome;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int start=0,end=str.length()-1;
		boolean flag=true;
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				flag=false;
				break;
			}
		start++;
		end--;
		}
		if(flag)
		System.out.println("Yes, it is an palindrome.");
		else
		System.out.println("No, it is not an palindrome");
		
	}

}
