package streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

import stringQuestion.Reverse;

public class Question {
	private static List<Integer> collect;

	public static void main(String[] args) {
		
		//reduce is used for aggregation (sum, max, min, product, concatenation).
		List<Integer> list = Arrays.asList(5,65,85,9,63,654,86,2,1,5,4,6,41,86);
		Optional<Integer> sum = list.stream().reduce((a,b)-> a+b);
		System.out.println("sum of all numbers are : "+ sum.get());
		
		// average of all number
		List<Integer> l2 = Arrays.asList(1,2,3,4,5,6);
		double avg=l2.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Average is: "+avg);
		
		
		//Square of all number
		List<Integer> l3 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> square = l3.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println("The Square of numbers are : "+square);
		
		
		//Square of all number then filter number greater than 100 and then get Average
		// We can supply multiple filters
		List<Integer> l4 = Arrays.asList(100,200,37,45,596,619);
		double filteredsquareavg=l4.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		System.out.println("The sqaure average of numbers greater than 100 are : "+filteredsquareavg);
		
		//Even And Odd
		List<Integer> l5 = Arrays.asList(5,65,85,9,63,654,86,2,1,5,4,6,41,86);
		List<Integer> even = l5.stream().filter(e-> e%2==0).collect(Collectors.toList());
		System.out.println("The even no are: "+even);
		List<Integer> odd = l5.stream().filter(e-> e%2!=0).collect(Collectors.toList());
		System.out.println("The odd no are: "+odd);
		
		//find no starting with number 2
		List<Integer> l6 = Arrays.asList(25,265,85,9,263,654,86,2,1,5,24,6,41,86);
		List<Integer> satrtwith2 = l6.stream().filter(num -> String.valueOf(num).startsWith("2")).collect(Collectors.toList());
		System.out.println("The num starting with 2 are : "+satrtwith2);
		
		List<Integer> satrtwith=l6.stream().map(e -> String.valueOf(e)).filter(e->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("Other way to nu start with 2 : "+satrtwith);
		
		
		//print duplicate number
		List<Integer> l7 = Arrays.asList(2,1,1,1,5,6,39,8,46,8,64,7);
		Set<Integer> duplicate = l7.stream().filter(e-> Collections.frequency(l7, e)>1).collect(Collectors.toSet());
		System.out.println("THe duplicate number in following list are : "+duplicate);
		
		
		//2nd methoed
		Set<Integer> dup2 = l7.stream().filter(e->l7.stream().filter(num->num==e).count()>1).collect(Collectors.toSet());
		System.out.println("second method used for duplicate : "+dup2);
		
		//3rd method
		Set<Integer> dup = new HashSet<>();
		Set<Integer> dup3 = l7.stream().filter( e-> !dup.add(e)).collect(Collectors.toSet());
		System.out.println("the 3rd method for duplicate elements : "+dup3);
		
		
		
		//MAx and Min Value
		List<Integer> l8 = Arrays.asList(25,-265,85,9,263,654,86,2,1,5,24,6,41,86);
		Integer max = l8.stream().max(Comparator.comparing(Integer::valueOf)).get();
		IntSummaryStatistics summaryStatistics = l8.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println("MAx value is: "+max);
		
		Integer min = l8.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min value is: "+min);
		
		
		//Sort number ascending and descending
		List<Integer> l9 = Arrays.asList(25,-265,85,9,263,654,86,2,1,5,24,6,41,86);
		List<Integer> acensding = l9.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order is "+acensding);
		
		List<Integer> decensding = l9.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("decending order is "+decensding);
		
		//skip first 5 element and show list
		List<Integer> l10 = Arrays.asList(2,1,1,1,5,6,39,8,46,8,64,7);
		
		// usecase of skip
		List<Integer> skip5 = l10.stream().skip(5).collect(Collectors.toList());
		System.out.println("original list : 2,1,1,1,5,6,39,8,46,8,64,7");
		System.out.println("After skipping 5 elements "+skip5);
		
		Integer sum1 = l10.stream().skip(5).reduce((a,b)->a+b).get();
		System.out.println("Sum of number after skipping fisrt 5 no are "+sum1);
		
		// usecase of limitt
		List<Integer> limit5 = l10.stream().limit(5).collect(Collectors.toList());
		System.out.println("original list : 2,1,1,1,5,6,39,8,46,8,64,7");
		System.out.println("first five elements are "+limit5);
					
		Integer sum2 = l10.stream().limit(5).reduce((a,b)->a+b).get();
		System.out.println("Sum of number of first 5 no are "+sum2);
		
		
		//find second highest number
		List<Integer> l11 = Arrays.asList(25,-265,85,9,263,654,86,2,1,5,24,6,41,86);
		Integer secondHighest = l11.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println("The Secong Highest from listr is "+secondHighest);
		
		
		
	}

}
