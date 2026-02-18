import java.util.Scanner;

public class MovingTicketPricingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the movieFormat");
        String movieFormat = scan.nextLine();
        System.out.println("Enter the showTime");
        String showTime = scan.nextLine();
        System.out.println("Enter the seatCategory");
        String seatCategory = scan.nextLine();
        System.out.println("Enter the customerType");
        String customerType = scan.nextLine();

        double baseTicketPrice = 12.0;

        double formatsurcharge = 0.0;
        if(movieFormat.equals("2D")){
            formatsurcharge = 0.0;
        }
        else if(movieFormat.equals("3D")){
            formatsurcharge = 5.0;
        }
        else if(movieFormat.equals("IMAX")){
            formatsurcharge = 8.0;
        }
        else if(movieFormat.equals("4DX")){
            formatsurcharge = 10.0;
        }

        double seatUpgradeFee = 0.0;
        if(seatCategory.equals("Standard")){
            seatUpgradeFee = 0.0;
        }
        else if(seatCategory.equals("Premium")){
            seatUpgradeFee = 4.0;
        }
        else if(seatCategory.equals("Recliner")){
            seatUpgradeFee = 7.0;
        }

        int timeBasedAdjustment = 0;
        if(showTime.equals("Matinee")){
            timeBasedAdjustment = -30;
        }
        else if(showTime.equals("Evening")){
            timeBasedAdjustment = 0;
        }
        else if(showTime.equals("Prime-Time")){
            timeBasedAdjustment = 20;
        }
        else if(showTime.equals("Late-Night")){
            timeBasedAdjustment = -20;
        }

        int customerDiscount = 0;
        if(customerType.equals("Adult")){
            customerDiscount = 0;
        }
        else if(customerType.equals("Senior")){
            customerDiscount = 25;
        }
        else if(customerType.equals("Student")){
            customerDiscount = 15;
        }
        else if(customerType.equals("Child")){
            customerDiscount = 30;
        }

        double baseWithSurcharges = baseTicketPrice+formatsurcharge+seatUpgradeFee;
        double adjustedPrice = baseWithSurcharges*(1+timeBasedAdjustment/100.0);
        double finalPrice = adjustedPrice*(1-customerDiscount/100.0);

        String concessionVoucher = "";

        if(showTime.equals("Matinee") || 
            customerType.equals("Senior") || 
            customerType.equals("Student") || 
            customerType.equals("Child")) {
                concessionVoucher = "Yes";
        } 
        else {
            concessionVoucher = "No";
        }

        String pricingCategory = "";
        if(finalPrice>=30.0){
            pricingCategory = "Luxury";
        }
        else if(finalPrice>=20.0 && finalPrice<30.0){
            pricingCategory = "Premium";
        }
        else {
            pricingCategory = "Value";
        }

        System.out.println("Movie Format: "+movieFormat);
        System.out.println("Show Time: "+showTime);
        System.out.println("Seat Category: "+seatCategory);
        System.out.println("Customer Type: "+customerType);
        System.out.println("Base Ticket Price: $"+baseTicketPrice);
        System.out.println("Format Surcharge: $"+formatsurcharge);
        System.out.println("Seat Upgrade Fee: $"+seatUpgradeFee);
        System.out.println("Time-Based Adjustment: "+timeBasedAdjustment+"%");
        System.out.println("Customer Discount: "+customerDiscount+"%");
        System.out.println("Final Ticket Price: $"+finalPrice);
        System.out.println("Concession Voucher: "+concessionVoucher);
        System.out.println("Pricing Category: "+pricingCategory);

        scan.close();
    }
}
