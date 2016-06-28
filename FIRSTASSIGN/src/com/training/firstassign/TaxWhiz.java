package com.training.firstassign;

public class TaxWhiz {
	
	private double taxRate;
	private double surchargeRate;
	private double totBill;
	
	
	public TaxWhiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaxWhiz(double taxRate, double surchargeRate, double totBill) {
		super();
		this.taxRate = taxRate;
		this.surchargeRate = surchargeRate;
		this.totBill = totBill;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public double getSurchargeRate() {
		return surchargeRate;
	}
	public void setSurchargeRate(double surchargeRate) {
		this.surchargeRate = surchargeRate;
	}
	public double getTotBill() {
		return totBill;
	}
	public void setTotBill(double totBill) {
		this.totBill = totBill;
	}
	
	public double calcTax()
	{
		return ((taxRate/100)*totBill)+totBill+surchargeRate;
	}

}
