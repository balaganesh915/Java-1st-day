package org.abstra;

public class Fullyinterface2 implements Fullyinterface,Fullyinterface1{

	@Override
	public void atm() {
		System.out.println(5000);
		
	}

	@Override
	public void savings() {
		System.out.println(10000);
		
	}

	@Override
	public void currentacc() {
		System.out.println("8%");
	}
	public static void main(String[] args) {
		Fullyinterface2 f = new Fullyinterface2();
		f.atm();
		f.savings();
		f.currentacc();
	}

}

