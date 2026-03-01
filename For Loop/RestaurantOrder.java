import java.util.*;

public class RestaurantOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        double subtotal = 0;
        int totalItems = 0;
        
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            
            double itemTotal = price * qty;
            subtotal += itemTotal;
            totalItems += qty;
            
            System.out.println("Item: " + name + " Price: $" + price + 
                    " x " + qty + " Subtotal: $" + itemTotal);
        }
        
        double tax = subtotal * 0.08;
        double service = subtotal * 0.10;
        double grandTotal = subtotal + tax + service;
        
        System.out.println("Total Items: " + totalItems);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (8%): $" + tax);
        System.out.println("Service Charge (10%): $" + service);
        System.out.println("Grand Total: $" + grandTotal);
    }
}
