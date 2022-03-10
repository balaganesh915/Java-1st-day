package com.tcs;

public class Stringg {
public static void main(String[] args) {
	String a = "Lenovo";
	String a1 = "Dell";
	String a2 = "Toshibhao";
	String a3 = "lenovo";
	String myStr = "Hello planet earth, you are a great planet.";
	
	System.out.println(a1 + " "+ a + " "+a2);
	System.out.println(myStr.indexOf('e',2));
	
	int length = a.length();
	System.out.println(length);
	
	boolean endsWith = a2.endsWith("ao");
	System.out.println(endsWith);
	
	boolean startsWith = a.startsWith("le");
	System.out.println(startsWith);
	
	boolean equalsIgnoreCase = a.equalsIgnoreCase(a3);
	System.out.println(equalsIgnoreCase);
	
	String replace = a1.replace('D', 'W');
	System.out.println(replace);
	
	boolean contains = a2.contains("w");
	System.out.println(contains);
	
	char charAt = myStr.charAt(8);
	System.out.println(charAt);
	
	
	
	
}
}
	

		  


