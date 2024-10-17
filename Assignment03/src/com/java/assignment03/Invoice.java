package com.java.assignment03;

public class Invoice {
	
	String partnumber;
	String partDescription;
	Double pricePerItem;
	int quantity;
	
	
	public Invoice(String partnumber, String partDescription, Double pricePerItem, int quantity) {
		
		this.partnumber = partnumber;
		this.partDescription = partDescription;
		this.pricePerItem = pricePerItem;
		this.quantity = quantity;
		
		
		
	}


	public String getPartnumber() {
		return partnumber;
	}


	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}


	public String getPartDescription() {
		return partDescription;
	}


	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}


	public Double getPricePerItem() {
		return pricePerItem;
	}


	public void setPricePerItem(Double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public double getInvoiceAmount()
	{
		return quantity * pricePerItem;
	}
			
	
}

