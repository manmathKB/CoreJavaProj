package com.mkb.factoryClassEx;

public class InstitutionalPlan extends Plan{
	public InstitutionalPlan() {
		System.out.println("you have choosen InstitutionalPlan and rate is "+this.getRate());
	}
	@Override
	public float getRate() {
		return 5.5f;
	}
	

}
