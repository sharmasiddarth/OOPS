package com.home.practice.invoice;

public class TestInvoice {
	
	public static void main(String[] args) {
		
		Invoice invoice = new Invoice();
		
		invoice.setPartNo("12e34");
		invoice.setPrice(-9.0);
		invoice.setQty(123);
		invoice.setPartDesc("fdaskdjf");
		
		System.out.println("Part No :"+invoice.getPartNo());
		System.out.println("Price : "+invoice.getPrice());
		System.out.println("Qty : "+invoice.getQty());
		System.out.println("Part Desc + "+invoice.getPartDesc());
		System.out.println("Invoice Amt is : "+invoice.getInvoice(invoice));
		
	}
}
