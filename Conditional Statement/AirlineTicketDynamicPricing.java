import java.util.Scanner;

public class AirlineTicketDynamicPricing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the bookingClass");
        String bookingClass = scan.nextLine();
        System.out.println("Enter the daysUntilDeparture 1 to 365");
        int days = scan.nextInt();
        System.out.println("Enter the seatAvailability");
        double seatAvailability = scan.nextDouble();
        System.out.println("Enter the routType");
        scan.nextLine();
        String routType = scan.nextLine();

        double basePrice = 0;
        if(bookingClass.equals("Economy")){
            if(routType.equals("Domestic")){
                basePrice = 200;
            }
            else if(routType.equals("International-Short")){
                basePrice = 500;
            }
            else if(routType.equals("International-Long")){
                basePrice = 800;
            }
        }
        else if(bookingClass.equals("Business")){
            if(routType.equals("Domestic")){
                basePrice = 600;
            }
            else if(routType.equals("International-Short")){
                basePrice = 1500;
            }
            else if(routType.equals("International-Long")){
                basePrice = 2500;
            }
        }
        else if(bookingClass.equals("First")){
            if(routType.equals("Domestic")){
                basePrice = 1000;
            }
            else if(routType.equals("International-Short")){
                basePrice = 30000;
            }
            else if(routType.equals("International-Long")){
                basePrice = 5000;
            }
        }
        System.out.println("Booking class: "+bookingClass);
        System.out.println("Days Until Departure: "+days);
        System.out.println("Seat Availability: "+seatAvailability+"%");
        System.out.println("Base Price: $"+basePrice);
        double finalPrice;
        double demandMultiplier;
        if(seatAvailability<30 && days<14){
            System.out.println("Demant Multipliyer: 1.8x");
            demandMultiplier = 1.8;
            finalPrice = basePrice*demandMultiplier;
            System.out.println("Final Ticket Price: $"+finalPrice);
            System.out.println("Price Category: High Demand");
        }  
        else if(seatAvailability<50 && days<30){
            System.out.println("Demand Multiplier: 1.5x");
            demandMultiplier = 1.5;
            finalPrice = basePrice*demandMultiplier;
            System.out.println("Final Ticket Price: $"+finalPrice);
            System.out.println("Price Category: High Demand");
        }   
        else if(seatAvailability<60 || (days>30 && days<60)){
            System.out.println("Demand Multipliyer: 1.0x");
            demandMultiplier = 1.0;
            finalPrice = basePrice*demandMultiplier;
            System.out.println("Final Ticket Price: $"+finalPrice);
            System.out.println("Price Category: Moderate");
        }
        else if(seatAvailability>=60 && days>60){
            System.out.println("Demand Multipliyer: 0.8x");
            demandMultiplier = 0.8;
            finalPrice = basePrice*demandMultiplier;
            System.out.println("Final Ticket Price: $"+finalPrice);
            System.out.println("Price Category: Low Demand");
        }
        scan.close();
    }
}
