package com.mkb.factoryClassEx;

public abstract class Plan {
	public abstract float getRate();
	
	public void calculate(float nou,float rate) {
		float totalBill=nou*rate;
		System.out.println("total bill amount is "+totalBill); 
	}
}
