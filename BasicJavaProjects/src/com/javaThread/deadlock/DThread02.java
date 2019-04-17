package com.javaThread.deadlock;

public class DThread02 extends Thread{
	DThResource rs1,rs2;
	public DThread02(DThResource rs1, DThResource rs2) {
		this.rs1 = rs1;
		this.rs2 = rs2;
	}

	@Override
	public void run() {
		rs2.res02(rs1);
			
	}
}
