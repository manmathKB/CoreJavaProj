package com.mkb.factoryClassEx;

public class DomesticPlan extends Plan{
	public DomesticPlan() {
		System.out.println("you have choosen DomesticPlan and rate is " + this.getRate());
	}
	@Override
	public float getRate() {
		
		return 3.5f;
	}
	

}
