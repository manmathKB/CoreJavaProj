package com.javaThread.daemon;

public class UserNonDaemonThread extends Thread {
	DaemonThread01 dth;
	
	@Override
	public void run() {
		dth = new DaemonThread01();
		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(20);
				System.out.println("main process " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
