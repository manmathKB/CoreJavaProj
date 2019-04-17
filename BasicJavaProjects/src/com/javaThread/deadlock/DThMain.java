package com.javaThread.deadlock;

public class DThMain {
	
	public static void main(String[] args) {
		DThResource rs1=null,rs2=null;
		
		DThread01 th1=null;
		DThread02 th2=null;
		
		rs1=new DThResource();
		rs2=new DThResource();
		
		th1=new DThread01(rs1,rs2);
		th2=new DThread02(rs1,rs2);
		
		th1.start();
		th2.start();
	}
}
