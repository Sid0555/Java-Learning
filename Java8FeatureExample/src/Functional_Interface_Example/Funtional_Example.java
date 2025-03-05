package Functional_Interface_Example;

@FunctionalInterface
interface calculator{
	
	int calculate(int a,int b);
};

public class Funtional_Example {

	
	public static void main(String[] args) {
		
		calculator add = (a,b)-> a +b ;
		calculator substract = (a,b)-> a-b;
		calculator multiply = (a,b)-> a*b;
		calculator divide = (a,b)-> a/b;
		
		
		System.out.println("The addition of two nums are "+ add.calculate(5, 9));
		
		
	}
	
	
}
