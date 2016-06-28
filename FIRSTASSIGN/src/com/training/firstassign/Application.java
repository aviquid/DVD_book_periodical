package com.training.firstassign;

import java.util.*;

public class Application {
	public static void main(String[] args) {
	String ch="Y";
	do{
	TaxWhiz a = new TaxWhiz();
	a.setTaxRate(10);
	a.setSurchargeRate(350);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter total bill");
	double bill=sc.nextDouble();
	a.setTotBill(bill);
	double val=a.calcTax();
	System.out.println(val);
	
	System.out.println("Y to continue, n to exit");
	ch=sc.next();
	
	}while(ch.equalsIgnoreCase("Y"));

}
}