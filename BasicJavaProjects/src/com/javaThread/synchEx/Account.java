package com.javaThread.synchEx;

public class Account {
	private int balance;

	public Account() {}

	public Account(int bal) {
		balance = bal;
	}
	
	/*synchronized public void withdraw(int amt) throws LowBalanceException {
		if(amt<=balance) {
			System.out.println("withdraw succedded of: "+amt);
			balance=balance-amt;
			System.out.println("balance after withdrawing "+amt+" is: "+balance);
			
		}else {
			throw new LowBalanceException("insufficient balance for amount "+amt);
		}
		
	}*/
	
	public void withdraw(int amt) throws LowBalanceException {
		if(amt<=balance) {
			System.out.println("withdraw succedded of: "+amt);
			balance=balance-amt;
			System.out.println("balance after withdrawing "+amt+" is: "+balance);
			
		}else {
			throw new LowBalanceException("insufficient balance for amount "+amt);
		}
		
	}
	
}
