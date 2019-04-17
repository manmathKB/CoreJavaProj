package com.javaThread.daemon;

public class DaemonThread01 implements Runnable {
	Thread th;

	public DaemonThread01() {
		th = new Thread(this);
		th.setDaemon(true);
		th.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i >= 0; i++) {
				Thread.sleep(10);
				System.out.println("background process running " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
