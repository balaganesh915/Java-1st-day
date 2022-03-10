package org.collections.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listt {
	public static void main(String[] args) {
		List<Object> l = new ArrayList<>();
		l.add("Name");
		l.add("Address");
		l.add('B');
		l.add(789);
		l.add(783.389);
		l.add(789);
		l.add(null);
		
		System.out.println("Array List");
		System.out.println(l);
		l.add(2, 56);
		System.out.println(l);
		boolean contains = l.contains(783.389);
		System.out.println(contains);
		System.out.println();
		System.out.println("Linked List");
		
		List<Integer> l1 = new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(50);
		
		
		System.out.println(l1);
		
		l1.add(3, 60);
		System.out.println(l1);
		Integer integer = l1.get(4);
		System.out.println(integer);
		boolean containsAll = l1.containsAll(l1);
		System.out.println(containsAll);
		int hashCode = l1.hashCode();
		System.out.println(hashCode);
		boolean contains2 = l1.contains(609);
		System.out.println(contains2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
