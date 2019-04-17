package com.mkb.factoryClassEx;

public class PlanFactory {
	
	public static Plan getInstance(String p) {
		Plan np=null;
		
		if(p.equalsIgnoreCase("DomesticPlan")) {
			np=new DomesticPlan();
		}
		
		else if(p.equalsIgnoreCase("InstitutionalPlan")) {
			np=new InstitutionalPlan();
		}
		
		else if(p.equalsIgnoreCase("CommercialPlan")) {
			np=new CommercialPlan();
		}
		else {
			System.out.println("no valid plan supplied");
		}
		
		return np;
	}

}
