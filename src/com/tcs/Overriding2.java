package com.tcs;

public class Overriding2 extends Overriding {
	
	public void atm(String t) {
         System.out.println("Opening time for atm is "+t);
	}
	
	@Override
	public void fixed(long fl) {
		super.fixed(fl);
		
	}
	public static void main(String[] args) {
		Overriding2 a = new Overriding2();
		a.fixed(250);
		a.atm("9 am");
		a.deposit("50000000");
		
	}
	
	
	
	
	
	
	
	
	
	

}
