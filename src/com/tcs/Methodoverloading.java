package com.tcs;

public class Methodoverloading {
	
	public void empId(String name) {
		System.out.println("My name is "+ name);
		
	}
   public void empId(String address,String city,int dob) {
	   System.out.println("Staying in "+ address  + " Born in "+ city + " on "+dob);
		
	}
   public void empId(int a) {
	   System.out.println("Todays date is "+a);
		
	}
   public void empId1(String data) {
	   System.out.println("Studying in "+ data);
		
	}
	

	public static void main(String[] args) {
		
		Methodoverloading m = new Methodoverloading();
		m.empId("Bala");
		m.empId("Omr","Chennai", 31);
		m.empId(21);
		m.empId1("greens");
		

	}

}
