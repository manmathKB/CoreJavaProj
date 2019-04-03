package com.mkb.logic;

import java.util.Scanner;

public class CheckLeapYear {
	
	//logic 1
	public static String checkLeap(int year) {
		if(year%100==0) {
				if(year%4==0 && year%400==0)
					return year+" is a leap  year";
				else
					return year+" not leap year";
		}
		
		return year+" not leap year";
	}
	//logic 2
	public static String checkLeap2(int year) {
		if((year%400==0)||(year%4==0 && year%100!=0)) {
					return year+" is a leap  year";
		}
		return year+" not leap year";
	}
	
	public static void main(String[] args) {
		int num=0;
		Scanner sc=null;
		
		sc=new Scanner(System.in);
		System.out.println("enter a year");
		num=sc.nextInt();
		
		System.out.println(CheckLeapYear.checkLeap(num));
		System.out.println(CheckLeapYear.checkLeap2(num));
		
	}

}
