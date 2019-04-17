package com.javaThread.synchEx;

public class UserTh2 extends Thread {
	Account atm;
	
	public UserTh2(Account atm) {
		this.atm = atm;
	}

	@Override
	public void run() {
		try {
			atm.withdraw(3000);
		} catch (LowBalanceException e) {
			e.printStackTrace();
		}
		
	}
}
