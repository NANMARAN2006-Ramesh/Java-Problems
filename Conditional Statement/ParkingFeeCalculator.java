import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the locationZone");
        String locationZone = scan.nextLine();
        System.out.println("Enter the parkingHour");
        double parkingHour = scan.nextDouble();
        System.out.println("Enter the vechicle Type");
        scan.nextLine();
        String vechicleType = scan.nextLine();
        System.out.println("Enter the membershipStatus");
        String membershipStatus = scan.next();

        double baseHourRate = 5.00;
        int zonePremium = 0;

        if(locationZone.equals("Downtown")){
            zonePremium = 50;
        }
        else if(locationZone.equals("Business-District")){
            zonePremium = 30;
        }
        else if(locationZone.equals("Residential")){
            zonePremium = 0;
        }
        else{
            zonePremium = 100;
        }

        double vechicleSizeSurcharge = 0.0;

        if(vechicleType.equals("Motorcycle")){
            vechicleSizeSurcharge = -2.0;
        }
        else if(vechicleType.equals("Compact") || vechicleType.equals("Sedan")){
            vechicleSizeSurcharge = 0.0;
        }
        else if(vechicleType.equals("SUV")){
            vechicleSizeSurcharge = 3.0;
        }
        else{
            vechicleSizeSurcharge = 5.0;
        }

        double rawFees = (baseHourRate * (1 + zonePremium / 100.0) + vechicleSizeSurcharge) * parkingHour;

        int membershipDiscount = 0;

        if (membershipStatus.equals("Monthly")) {
            membershipDiscount = 20;
        }
        else if(membershipStatus.equals("Annual")){
            membershipDiscount = 25;
        }
        else if(membershipStatus.equals("VIP")){
            membershipDiscount = 30;
        }

        double discountedFee = rawFees * (1 - membershipDiscount / 100.0);

        double dailyCapAmount = 0.0;
        String dailyCap = "No";

        if(parkingHour >= 24.0){
            dailyCap = "Yes";

            if(locationZone.equals("Downtown")){
                dailyCapAmount = 150.0;
            }
            else if(locationZone.equals("Business-District")){
                dailyCapAmount = 120.0;
            }
            else if(locationZone.equals("Residential")){
                dailyCapAmount = 60.0;
            }
            else{
                dailyCapAmount = 180.0; 
            }

            if(discountedFee > dailyCapAmount){
                discountedFee = dailyCapAmount;
            }
        }

        String rageCategory = "";

        if(locationZone.equals("Downtown") || locationZone.equals("Business-District")){
            rageCategory = "Premium";
        }
        else if(locationZone.equals("Airport")){
            rageCategory = "Luxury";
        }
        else{
            rageCategory = "Standard";
        }

        System.out.println("Location Zone: " + locationZone);
        System.out.println("Parking Duration: " + parkingHour + " hours");
        System.out.println("Vehicle Type: " + vechicleType);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Base Hourly Rate: $" + baseHourRate);
        System.out.println("Zone Premium: " + zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + vechicleSizeSurcharge);
        System.out.println("Membership Discount: " + membershipDiscount + "%");
        System.out.println("Total Parking Fee: $" + discountedFee);
        System.out.println("Daily Cap Applied: " + dailyCap);
        System.out.println("Rate Category: " + rageCategory);

        scan.close();
    }
}
