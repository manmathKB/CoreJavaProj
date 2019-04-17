package com.javaThread.daemon;

public class DaemonCheck {

	public static void main(String[] args) {
		UserNonDaemonThread undth=null;
		
		undth=new UserNonDaemonThread();
		undth.start();
	
	}

}
