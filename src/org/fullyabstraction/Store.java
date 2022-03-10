package org.fullyabstraction;

public class Store implements Purchase {

	@Override
	public void bag() {
		System.out.println("Collection of list");
	}

	@Override
	public void list() {
	   System.out.println("taken place in bag");	
	}
	public static void main(String[] args) {
		Store s = new Store();
		s.bag();
		s.list();
	}
	

}
