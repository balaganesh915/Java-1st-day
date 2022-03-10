package org.abstra;

public class Fullabstract extends Abstract{
	@Override
	public void breakfast() {
		System.out.println("Chappathi");
	}
	public static void main(String[] args) {
		Fullabstract d=new Fullabstract();
		d.breakfast();
		d.voterid();
		d.pancard();
	}
	
	

}
