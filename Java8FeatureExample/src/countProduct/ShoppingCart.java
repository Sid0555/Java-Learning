package countProduct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> cart = new HashMap<>();
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline character
            
            switch (option) {
                case 1:
                    // Add product to cart
                    System.out.print("Enter product name: ");
                    String product = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    
                    // Update quantity if product exists, or add new product
                    cart.put(product, cart.getOrDefault(product, 0) + quantity);
                    
                    System.out.println(quantity + " units of " + product + " added to cart.");
                    break;
                    
                case 2:
                    // View cart
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        System.out.println("Your cart:");
                        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue() + " units");
                        }
                    }
                    break;
                    
                case 3:
                    // Exit
                    System.out.println("Thank you for shopping!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }
}
