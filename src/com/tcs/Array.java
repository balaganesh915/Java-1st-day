package com.tcs;

public class Array {
	public static void main(String[] args) {
		int [] u= new int [] {1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		
		for (int i = 0; i < u.length; i++) {
			
			sum=sum+u[i];
		}		
		int s = u.length;
		System.out.println(s);
		System.out.println(u[1]);
		System.out.println("sum of the arrays are "+ sum);
		int ave = sum/u.length;
		System.out.println("average is "+ ave);
		
	}
	
	
	
	
	

}
