package LamdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LamdaFunction {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Abhishek");
		l1.add("chota don");
		l1.add("joker");
		l1.add("spidermane");
		l1.add("wicked sunny");
		l1.add("BAtman");
		List<String> l2=l1.stream().filter(e->e.startsWith("s")).toList();
		l2.forEach(System.out::println);
		
		List<Integer> l3 = Arrays.asList(1,1,4,8,77,56,76,789000,3,5,5,6);
		List<Integer>l4=l3.stream().distinct().sorted().toList();
		l4.forEach(System.out::println);
		
		
		Runnable runnable = ()->System.out.println("hello world");
		runnable.run();
		
		Consumer<String> greet = name -> System.out.println("Hello, "+ name);
		greet.accept("alice");
		
		Function<Integer,Integer> square = n ->{
			int result = n*n;
			
			System.out.println("Square of "+n+" is "+result);
			return result;
			 };
			 
			 square.apply(4);
			
			 //custom functional interface
			 @FunctionalInterface
			interface apunkamaths {
				 
				 //declared single abstract method
				int operate(int a, int b);
			}
			 
			 apunkamaths add = (a,b)-> a+b;
			 apunkamaths multiply =(a,b)->a*b;
			 
			 System.out.println("addition"+add.operate(67, 3));
			 System.out.println("multiplication"+multiply.operate(5, 4));
			 
			 
			 //sort name by letters 
			 
			 l1.sort((c1,c2) -> c1.compareTo(c2));
			 System.out.println(l1);
			 
			 //sort by length of country name 
			 
			 l1.sort((c1,c2)-> Integer.compare(c1.length(), c2.length()));
			 System.out.println(l1);
			 
	}

}
