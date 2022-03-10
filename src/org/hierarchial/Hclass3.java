package org.hierarchial;

public class Hclass3 extends Hclass2{
	
	public void Pencil() {
		System.out.println("Apsara");
	}
	
	public void Pen() {
		System.out.println("Hero");
	}
	
	public static void main(String[] args) {
		Hclass3 hi = new Hclass3();
		hi.StudentName();
		hi.StudentName1();
		hi.ProfessorName();
		hi.ProffesorName1();
		hi.Pen();
		hi.Pencil();
		
		
	}

}
