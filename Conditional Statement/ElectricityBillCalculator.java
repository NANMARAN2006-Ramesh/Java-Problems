import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter units consumed:");
        int unitsConsumed = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter customer type (Residential/Commercial/Industrial):");
        String customerType = scan.nextLine();

        System.out.println("Enter season (Summer/Winter/Regular):");
        String season = scan.nextLine();

        System.out.println("Enter payment method (Auto-Pay/Online/Manual):");
        String paymentMethod = scan.nextLine();

        double tier1 = 0.0;
        double tier2 = 0.0;
        double tier3 = 0.0;
        double tier4 = 0.0;

        if(customerType.equals("Residential")){
            if(unitsConsumed <= 100){
                tier1 = unitsConsumed * 0.10;
            }
            else if(unitsConsumed <= 300){
                tier1 = 100 * 0.10;
                tier2 = (unitsConsumed - 100) * 0.15;
            }
            else if(unitsConsumed <= 500){
                tier1 = 100 * 0.10;
                tier2 = 200 * 0.15;
                tier3 = (unitsConsumed - 300) * 0.25;
            }
            else{
                tier1 = 100 * 0.10;
                tier2 = 200 * 0.15;
                tier3 = 200 * 0.25;
                tier4 = (unitsConsumed - 500) * 0.30;
            }
        }
        else if(customerType.equals("Commercial")){
            if(unitsConsumed <= 100){
                tier1 = unitsConsumed * 0.12;
            }
            else if(unitsConsumed <= 300){
                tier1 = 100 * 0.12;
                tier2 = (unitsConsumed - 100) * 0.18;
            }
            else if(unitsConsumed <= 500){
                tier1 = 100 * 0.12;
                tier2 = 200 * 0.18;
                tier3 = (unitsConsumed - 300) * 0.25;
            }
            else{
                tier1 = 100 * 0.12;
                tier2 = 200 * 0.18;
                tier3 = 200 * 0.25;
                tier4 = (unitsConsumed - 500) * 0.25;
            }
        }
        else if(customerType.equals("Industrial")){
            if(unitsConsumed <= 100){
                tier1 = unitsConsumed * 0.08;
            }
            else if(unitsConsumed <= 300){
                tier1 = 100 * 0.08;
                tier2 = (unitsConsumed - 100) * 0.12;
            }
            else if(unitsConsumed <= 500){
                tier1 = 100 * 0.08;
                tier2 = 200 * 0.12;
                tier3 = (unitsConsumed - 300) * 0.20;
            }
            else{
                tier1 = 100 * 0.08;
                tier2 = 200 * 0.12;
                tier3 = 200 * 0.20;
                tier4 = (unitsConsumed - 500) * 0.20;
            }
        }

        int seasonalAdjustment = 0;
        if(season.equals("Summer")){
            seasonalAdjustment = 15;
        }
        else if(season.equals("Winter")){
            seasonalAdjustment = -10;
        }
        else{
            seasonalAdjustment = 0;
        }

        int paymentDiscount = 0;
        if(paymentMethod.equals("Auto-Pay")){
            paymentDiscount = 5;
        }
        else if(paymentMethod.equals("Online")){
            paymentDiscount = 3;
        }
        else{
            paymentDiscount = 0;
        }

        double subtotal = tier1 + tier2 + tier3 + tier4;
        double seasonalAmount = subtotal * seasonalAdjustment / 100.0;
        double afterSeason = subtotal + seasonalAmount;
        double discountAmount = afterSeason * paymentDiscount / 100.0;
        double totalBill = afterSeason - discountAmount;
        double averageRate = totalBill / unitsConsumed;

        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1);
        System.out.println("Tier 2 Cost (101-300): $" + tier2);
        System.out.println("Tier 3 Cost (301-500): $" + tier3);
        System.out.println("Tier 4 Cost (501+): $" + tier4);
        System.out.println("Seasonal Adjustment: " + seasonalAdjustment + "%");
        System.out.println("Payment Discount: " + paymentDiscount + "%");
        System.out.printf("Total Bill: $%.2f\n", totalBill);
        System.out.printf("Average Rate: $%.2f/kWh\n", averageRate);

        scan.close();
    }
}
