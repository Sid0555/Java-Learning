package countProduct;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MAIn {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String,Integer> m1= new TreeMap<>();
		
	
		
		boolean ex = false;
		
		while(ex!=true) {
			
			System.out.println("Select Option \n"
					+ "1.Add Product \n"
					+"2.view Product Quantity \n"
					+"3.Exit");
			
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num==1) {
				
				System.out.println("Enter product name :");
				String n1= sc.nextLine();
				
				System.out.println("Enter Quantity :");
				int qt=sc.nextInt();
				sc.nextLine();
				//m1.put(n1, qt);
				
			 for(Map.Entry<String, Integer> entry : m1.entrySet()) {
				 if(entry.getKey().equals(n1)) {
					qt = entry.getValue()+qt;
					((Map<String, Integer>) entry).put(n1, qt);
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                    
				 }
				 else {
					 m1.put(n1, qt);
				 }
				 
			 }
				
				
			}else if(num==2) {
				
				
				System.out.println(m1);
				
			}
			
			
		}
		
	
	}
}
