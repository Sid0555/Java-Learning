package JavaVariables;

import java.util.Scanner;

public class Fibonaci_series {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a=0;
		int b=1;
		
		System.out.println("fibonacci for "+size+" are : "+a+","+b);
		for(int i =2; i<=size; i++ ) {
			int c = a+b;
			System.out.println(" "+ c);
			a=b;
			b=c;
			
		}
		//System.out.println();
		
	}

}
