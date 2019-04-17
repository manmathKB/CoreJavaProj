package com.mkb.gcManual;

public class GCCollectorMain {
	
	public static void main(String[] args) throws Exception {
		
		for(int i=0;i<10;i++) {
			new Employee(12, "mkb");
			Thread.sleep(600);
			//Runtime.getRuntime().gc();
			System.gc();
		}
	}
}
