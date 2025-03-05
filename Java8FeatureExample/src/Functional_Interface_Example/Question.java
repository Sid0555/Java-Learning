package Functional_Interface_Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question {

	

	public static void main(String[] args) {
/*
		 *
Here are some sample coding questions on the Stream API in Java 8 to help you practice and understand its features better:

1. Filter Even Numbers
Given a list of integers, filter out the even numbers and collect them into a new list.*/

	List<Integer> l1 = Arrays.asList(1,2,3,4,5,5,7);
	List<Integer> evenl1 =l1.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(evenl1);

		/* 2. Find Maximum Value
Find the maximum value in a list of integers using the Stream API.*/
	List<Integer> l2 = Arrays.asList(10,20,7,70,9,88);
	int max = l2.stream().reduce(Integer.MIN_VALUE,Integer::max);
	System.out.println(max);
		/* 3. Sort a List
Given a list of strings, sort them in reverse alphabetical order using streams.*/

		/* 4. Count Strings with Specific Length
Count the number of strings in a list that have a length greater than 5.*/
	List<String> l4 =Arrays.asList("one","threww","bademiya","meinkaff","kafka","tameimpala");
	List<String> lengreterthan5 = l4.stream().filter(e->e.length()>5).collect(Collectors.toList());
	long Countlen = l4.stream().filter(e->e.length()>5).count();
	System.out.println(lengreterthan5);
	System.out.println("The count of names length greater than 5 is "+Countlen);

		/* 5. Map to Square
Given a list of integers, create a new list with the square of each number.*/
		
	List<Integer> l5 = Arrays.asList(1,2,3,4,5,6);
	List<Integer> square=l5.stream().map(e->e*e).collect(Collectors.toList());
	System.out.println("the square list is "+square);

		/* 6. Find Distinct Elements
Remove duplicates from a list of integers and collect the result into a new list.*/
	List<Integer> l6 = Arrays.asList(5,8,77,9,5,77,8,3,56,9);
	List<Integer> distinct = l6.stream().distinct().toList();
	System.out.println(distinct);

		/* 7. Find First Matching Element
Find the first string in a list that starts with the letter 'A'.
 If no such element exists, return a default value like "No Match".*/
	List<String> l7 = Arrays.asList("Ajay","Atul","Vimal","vipul","Dhanraj","Adwait");
	String l7StartwithA = l7.stream().filter(str->str.startsWith("A")).findFirst().orElse("no Match");
	System.out.println(l7StartwithA);
	

		/* 8. Group By Length
Group a list of strings by their lengths using Collectors.groupingBy().*/
	List<String> l8 = Arrays.asList("Java", "API", "Stream", "Lambda");
	Map<Integer, List<String>> group = l8.stream().collect(Collectors.groupingBy(String::length));
	System.out.println(group);
		/* 9. Calculate Sum
Calculate the sum of all integers in a list using reduce().*/

		/* 10. Find String with Maximum Length
Find the string with the maximum length from a list.*/

		/* 11. Partition Numbers
Partition a list of integers into two groups: even and odd numbers.*/

	List<Integer> l11 = Arrays.asList(1, 2, 3, 4, 5, 6);
	Map<Boolean, List<Integer>> partition = l11.stream().collect(Collectors.partitioningBy(num -> num%2 == 0));
	System.out.println(partition);
		
		/* 12. Generate a Fibonacci Series
Use Stream.iterate() to generate the first 10 numbers of the Fibonacci series.*/

		/* 13. Skip and Limit
Given a list of integers, skip the first 3 elements and then collect the next 5 elements into a new list.*/

		/* 14. Count Occurrences
Count the occurrences of each character in a string using streams.*/

		/* 15. Join Strings
Given a list of strings, concatenate them into a single string separated by commas.*/

		/* 16. FlatMap Example
Given a list of lists of integers, flatten it into a single list of integers.*/

		/* 17. Find Average
Find the average of a list of integers using the Stream API.*/

		/* 18. Check All Match
Check if all numbers in a list are positive using allMatch().*/
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	boolean allPositive = numbers.stream().allMatch(num->num>0);
	System.out.println(allPositive);

		/* 19. Custom Comparator
Sort a list of employees (using a custom Employee class) by salary in descending order.*/

		/* 20. Parallel Stream
Use a parallel stream to process a large list of numbers and calculate their sum.*/

	
	List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
    int sum = num.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Sum: " + sum);
	}

}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				 