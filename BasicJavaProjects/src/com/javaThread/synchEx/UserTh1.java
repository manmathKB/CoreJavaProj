package com.javaThread.synchEx;

public class UserTh1 extends Thread {
Account atm;
	
	public UserTh1(Account atm) {
		this.atm = atm;
	}

	@Override
	public void run() {
		try {
			atm.withdraw(2000);
		} catch (LowBalanceException e) {
			e.printStackTrace();
		}
		
	}
}
