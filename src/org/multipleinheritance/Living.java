package org.multipleinheritance;

public class Living extends Myself implements From {
    
	@Override
	public void from() {
		System.out.println("I'm from Kanyakumari");
		
	}
	@Override
	public void studied() {
		System.out.println("Studied in RIT");
		
	}
	
	
	public static void main(String[] args) {
		Living l= new Living();
		l.me();
		l.from();
		l.livingin();
		l.studied();
		
	}


	

	

}
