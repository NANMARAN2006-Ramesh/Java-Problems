import java.util.*;

public class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        double originalTotal = 0;
        double finalTotal = 0;
        
        for (int i = 1; i <= N; i++) {
            String seat = sc.next();
            String customer = sc.next();
            
            double basePrice = 0;
            
            if (seat.equals("Regular"))
                basePrice = 12;
            else if (seat.equals("Premium"))
                basePrice = 18;
            else if (seat.equals("Recliner"))
                basePrice = 25;
            
            double discount = 0;
            
            if (customer.equals("Child"))
                discount = 30;
            else if (customer.equals("Senior"))
                discount = 25;
            
            double finalPrice = basePrice * (1 - discount / 100);
            
            originalTotal += basePrice;
            finalTotal += finalPrice;
            
            System.out.println("Ticket " + i + ": " + seat + " - " + customer +
                    " Base Price: $" + basePrice +
                    " Discount: " + discount + "%" +
                    " Final Price: $" + finalPrice);
        }
        
        boolean groupApplied = false;
        if (N >= 5) {
            finalTotal = finalTotal * 0.9;
            groupApplied = true;
        }
        
        double totalDiscount = originalTotal - finalTotal;
        
        System.out.println("Total Tickets: " + N);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Group Discount Applied: " + (groupApplied ? "Yes" : "No"));

        sc.close();
    }
}