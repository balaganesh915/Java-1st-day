package org.collections.com;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sett {
	public static void main(String[] args) {
		Set<Object> s = new HashSet<>();
		s.add("Values");
		s.add(70);
		s.add(89);
		s.add('V');
		s.add(89.90);
		s.add(null);
		s.add('V');
		System.out.println("Hash Set");
		
		System.out.println(s);
		boolean containsAll = s.containsAll(s);
		System.out.println(containsAll);
		boolean remove = s.remove(710);
		System.out.println(remove);
		
		
		
	}

}
