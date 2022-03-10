package org.collections.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapp {
	public static void main(String[] args) {
		
	
	 Map<Integer, Object> m = new LinkedHashMap<>();
	 m.put(10, "Bala");
	 m.put(11, 709);
	 m.put(12, 485);
	 m.put(13, 'C');
	 m.put(14, null);
	 m.put(15, 89.2626);
	 m.put(10, "Ganesh");
	 
	 System.out.println("Linked Hash Map");
	 System.out.println(m);
	 
	 Object object1 = m.get(12);
	 System.out.println(object1);
	 
	 boolean containsKey = m.containsKey(15);
	 System.out.println(containsKey);
	 int hashCode = m.hashCode();
	 System.out.println(hashCode);
	 
	 boolean containsValue = m.containsValue("Ganesh");
	 System.out.println(containsValue);
	 boolean empty = m.isEmpty();
	 System.out.println(empty);
	 Object remove = m.remove(13);
	 System.out.println(remove);
	
	 System.out.println();
	 
	 System.out.println("Tree Map");
	 
	 Map<Integer, Object> mm =new TreeMap<>();
	 mm.put(6, "jdjd");
	 mm.put(7, 7337387);
	 mm.put(1, "Yuvan");
	 mm.put(2, 89);
	 mm.put(3,'Y');
	 mm.put(1, "Harris");
	 mm.put(4, 90.99);
	 mm.put(5, null);
	 
	 System.out.println(mm);
	 
	 Object object = mm.get(3);
	 System.out.println(object);
	 boolean containsKey2 = mm.containsKey(5);
	 System.out.println(containsKey2);
	 boolean containsValue2 = mm.containsValue("Harris");
	 System.out.println(containsValue2);
	 
	// boolean remove2 = mm.remove(4, 90.99);
	 //System.out.println(remove2);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
}
