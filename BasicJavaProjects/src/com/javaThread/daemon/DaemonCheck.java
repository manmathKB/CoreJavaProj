package com.javaThread.daemon;

import java.util.Scanner;

public class DaemonCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		UserNonDaemonThread undth=null;
		
		undth=new UserNonDaemonThread();
		undth.start();
	}

}
