package com.mkb.factoryClassEx;

public class CommercialPlan extends Plan {
	public CommercialPlan() {
		System.out.println("you have choosen CommercialPlan and rate is " + this.getRate());
	}

	@Override
	public float getRate() {

		return 7.5f;
	}

}
