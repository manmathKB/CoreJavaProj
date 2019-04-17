package com.mkb.factoryClassEx;

import java.util.Scanner;

public class PowerBillCalc {
	
	public static void main(String[] args) {
		Scanner sc=null;
		float nou=0f;
		float rate=0.0f;
		Plan pp=null;
		String pl=null;
		
		sc=new Scanner(System.in);
		
		System.out.println("enter the plan:");
		pl=sc.next();
		System.out.println("enter the no of unit");
		nou=sc.nextFloat();
		
		pp=PlanFactory.getInstance(pl);
		rate=pp.getRate();
		pp.calculate(nou, rate);
		
	}
}
