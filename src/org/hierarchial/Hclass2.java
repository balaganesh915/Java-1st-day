package org.hierarchial;

public class Hclass2 extends Hclass1 {
	
	public void ProfessorName() {
		System.out.println("Rajan");
	}
	
	public void ProffesorName1() {
		System.out.println("Maran");
	}
	public static void main(String[] args) {
		Hclass2 hq = new Hclass2();
		hq.StudentName();
		hq.StudentName1();
		hq.ProfessorName();
		hq.ProffesorName1();
	}
	
	

}
