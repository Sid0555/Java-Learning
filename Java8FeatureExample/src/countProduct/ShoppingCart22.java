package countProduct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart22 {
	
	public static void main(String[] args) {
		
		Map<String,Integer> m1 = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the Option");
			System.out.println("1. Add Product");
			System.out.println("2. view Product");
			System.out.println("3. Exit");
			
			int option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			case 1: {
				System.out.println("Enter the Product");
				String productName=sc.nextLine();
				System.out.println("ENter the quantity");
				int quantity = sc.nextInt();
				
				m1.put(productName, m1.getOrDefault(productName, 0)+quantity);
				
				System.out.println("the product name is "+ productName+" the quantity is" +quantity);
				break;
				
				
			}
			
			case 2: {
				  if (m1.isEmpty()) {
                      System.out.println("Your cart is empty.");
                  } else {
                      System.out.println("Your cart:");
                      for (Map.Entry<String, Integer> entry : m1.entrySet()) {
                          System.out.println(entry.getKey() + " - " + entry.getValue() + " units");
                      }
                  }
                  break;
                  
				
				
			}
			case 3: {
				System.out.println("bye bye");
				return;
			}
			
			
			
			
			default:
				System.out.println("Enter the valid option");
			}
			
		}
		
	}
	
	

}
