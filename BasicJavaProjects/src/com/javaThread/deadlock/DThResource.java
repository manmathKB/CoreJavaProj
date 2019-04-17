package com.javaThread.deadlock;

public class DThResource {

	public synchronized void res01(DThResource rs) {
		System.out.println("resource 01 begin");
		//sleep is optional here 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//accessing other locked resource using other object
		rs.res02(this);
		System.out.println("rerource 01 end");
	}

	public synchronized void res02(DThResource rs) {
		System.out.println("resource 02 begin");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//accessing other locked resource using other object
		rs.res01(this);
		System.out.println("resource 02 end");
	}

}
