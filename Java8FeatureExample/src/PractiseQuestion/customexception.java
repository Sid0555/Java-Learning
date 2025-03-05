package PractiseQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class customexception {
	public static void main(String[] args) {
		int a = 10;
		
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,5));
		 List<String> list = List.of("Apple", "Banana", "Mango");
		 //This list is immutable, so you cannot modify (add/remove) elements.
		
		l1.add(5);
		l1.add(8);
		l1.add(88);
		l1.add(1);
		
		List<Integer> l2 =l1.stream().filter(e->e % 2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		Map <Integer,String> m1 = new HashMap<>();
		m1.put(1, "first");
		m1.put(2, "second");
		m1.put(3, "third");
		m1.put(4, "fourth");
		
		for (Entry<Integer, String> i : m1.entrySet()) {
			
			if(i.getKey().equals(3)) {
				System.out.println(i.getValue());
			}else {
				System.out.println("not found");
			}
			
		}
		
	}

}
