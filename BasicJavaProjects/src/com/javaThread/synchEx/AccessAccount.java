package com.javaThread.synchEx;

public class AccessAccount {
	
	
	public static void main(String[] args) {
		Account atm=new Account(4000);
		
		UserTh1 th1=null;
		UserTh2 th2=null;
		
		th1=new UserTh1(atm);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th2=new UserTh2(atm);

		th1.start();
		th2.start();
		
	}

}
