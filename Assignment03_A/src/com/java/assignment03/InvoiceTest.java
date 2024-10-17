package com.java.assignment03;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice("1001" , "JAYESH" , 14.99 , 2);

		
		System.out.println("Part Number:= " + invoice.getPartnumber());
		System.out.println("Part Description:= " + invoice.getPartDescription());
		System.out.println("Part Quantity:= " + invoice.getQuantity());
		System.out.println("Price Per Item:= " + invoice.getPricePerItem());
		System.out.println("InvoiceAmount:= " + invoice.getInvoiceAmount());
		
		
	
		System.out.println("\nUpdated Invoice Details");
		
		System.out.println("Quantity:=" + invoice.getQuantity());
		System.out.println("Price Per Item:= " + invoice.getPricePerItem());
		System.out.println("Invoice Amount:= " + invoice.getInvoiceAmount());
	}
}
