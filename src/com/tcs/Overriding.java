package com.tcs;

public class Overriding {
	
	public void saving(int s) {
		System.out.println("Current Savings is "+s);

	}
	
	public void fixed(long fl) {
		System.out.println("Fixed amount is "+ fl);

	}
	
	public void deposit(String amt) {
           System.out.println("Deposited amout is "+ amt);
	}
	
	public static void main(String[] args) {
		Overriding bank = new Overriding();
		bank.saving(50);
		bank.fixed(100);
		bank.deposit("200");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
