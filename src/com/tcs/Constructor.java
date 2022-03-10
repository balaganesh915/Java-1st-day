package com.tcs;

public class Constructor {
	public Constructor(String s) {
		System.out.println("Institute name is "+s);
	}
    public Constructor(String a,int i) {
		System.out.println("Street number is "+ i + "  placed in "+a);
	}
    public Constructor() {
		System.out.println("joined on 21/12/2021");
	}
    public static void main(String[] args) {
		Constructor c = new Constructor("Greens");
		Constructor c1 = new Constructor("Adayar", 7);
		Constructor c2 = new Constructor();
	}

}
