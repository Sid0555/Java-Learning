package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class practise {
	public static void main(String[] args) {
//	How can you use the reduce() method to find the sum of all numbers in a list?
		List<Integer> l1 = Arrays.asList(1,2,4,55,7,78,3,4,5,6,7,8,9,10);
		Integer sum = l1.stream().reduce((a,b)->a+b).get();
		System.out.println(sum);
		
		Integer sub=l1.stream().reduce((a,b)->a-b).get();
		System.out.println(sub);
		
		Integer mul=l1.stream().reduce((a,b)->a*b).get();
		System.out.println(mul);
		
		Integer div = l1.stream().reduce((a,b)->a/b).get();
		System.out.println(div);
		
//	How do you calculate the average of a list of integers using Java Streams?
		List<Integer>l2= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		double avg = l2.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		double avg1 = l2.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(avg1);
		
		/*IntSummaryStatistics is a class in java.util that is used to collect statistical data about a stream of integers. It helps compute summary statistics such as:
        ✔ Count (Number of elements)
        ✔ Sum (Total sum of elements)
        ✔ Min (Smallest number)
        ✔ Max (Largest number)
        ✔ Average (Mean value)

*/
		IntSummaryStatistics s1 = l2.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println("averge : " +s1.getAverage());
		System.out.println("MAx : " +s1.getMax());
		System.out.println("Min : "+s1.getMin());
		System.out.println("Sum :"+s1.getSum());
	
		
		
//	How do you compute the square of all numbers in a list using Streams?
		List<Integer>squrae=l1.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println("Square of num are : "+squrae);
//	How do you find the average of squared numbers greater than 100 using Streams?
		
		List<Integer>l3=Arrays.asList(1,22,76,98,78,65,76,777,5);
		List<Integer> ans = l3.stream().filter(e->e>100).map(e->e*e).collect(Collectors.toList());
		double avans =l3.stream().filter(e->e>100).map(e->e*e).mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println("average of square of num greate rtahn 100 : "+avans);

		System.out.println(l3);
		System.out.println("Sqaure of num reater than 100 : "+ans);
//	How do you separate a list of numbers into even and odd numbers using Streams?
		List<Integer> even = l1.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("Even num are : "+even);
		List<Integer> odd = l1.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println("Odd num are : "+odd);
		
		
//	How can you find numbers in a list that start with the digit '2' using Streams?
		
		List<Integer> startwith2 = l1.stream().filter(e-> String.valueOf(e).startsWith("2")).collect(Collectors.toList());
		System.out.println("num st with 2 : "+startwith2);
//	What are two different ways to filter numbers that start with a specific digit in a list using Streams?
		l1.stream().filter(e-> String.valueOf(e).startsWith("5")).collect(Collectors.toList());
		
		
//	How do you find duplicate numbers in a list using Streams?
	l1.stream().filter(e-> Collections.frequency(l3, e)>1).collect(Collectors.toSet());
//	What are the three different methods to find duplicate numbers in a list using Streams?
	l1.stream().filter(e->l1.stream().filter(num->num==e).count()>1).collect(Collectors.toSet());
	Set<Integer> dup = new HashSet<>();
	List<Integer> l8 = Arrays.asList(1,1,2,2,4,5,6,6,7);
	l8.stream().filter(e-> !dup.add(e)).collect(Collectors.toSet());
	System.out.println(dup.size());
//	How do you find the maximum and minimum values in a list using Streams?
	IntSummaryStatistics summaryStatistics = l8.stream().mapToInt(Integer::intValue).summaryStatistics();
	double average = summaryStatistics.getAverage();
	int max = summaryStatistics.getMax();
	
//	How do you sort a list in ascending and descending order using Streams?
//	What is the use of the skip() method in Streams, and how does it affect the list?
//	How do you compute the sum of numbers after skipping the first 5 elements in a list?
//	What is the use of the limit() method in Streams, and how does it work?
//	How do you compute the sum of the first 5 numbers in a list using Streams?
//	How do you find the second highest number in a list using Streams?
	}

}
