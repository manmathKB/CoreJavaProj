package com.mkb.gcManual;

public class Employee {
	private int eno;
	private String ename;
	
	public Employee(int eno, String ename) {
		System.out.println("Employee:Employee()"+this);
		this.eno = eno;
		this.ename = ename;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee:------->finalize()"+this);
	}
	

	
}
