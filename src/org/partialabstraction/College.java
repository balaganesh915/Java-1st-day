package org.partialabstraction;

public class College extends School {

	@Override
	public void nursery() {
          System.out.println("fifth");		
	}
      public static void main(String[] args) {
		College c = new College();
		c.high();
		c.nursery();
		c.second();
	}
}
