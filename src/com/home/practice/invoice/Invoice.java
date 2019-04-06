package com.home.practice.invoice;

/*
 *part number(type String),a part description(type String),
 *a quantity of the item being purchased (type int) and 
 *a price per item  (double). 
 * 
*/

public class Invoice {
	
	private String partNo;
	private String partDesc;
	private int qty;
	private double price;
	
	public Invoice() {
		
	}
	
	public Invoice(String partNo,String partDesc,int qty,double price) {
		
		this.partNo = partNo;
		this.partDesc = partDesc;
		this.qty = qty;
		this.price = price;		
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQty() {
		
		if(qty <= 0 )
			qty = 0;
		
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		if(price <= 0)
			price = 0.0;
		
		this.price = price;
	}
	
	public double getInvoice(Invoice invoice) {		
		
		return qty*price;			
	}
	
}
