import java.util.Scanner;

public class HotelRoomBookingAndPricing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the roomCategory");
        String roomCategory = scan.nextLine();
        System.out.println("Enter the Season");
        String season = scan.nextLine();
        System.out.println("Enter the nightsBooked 1 to 30");
        int nightsBooked = scan.nextInt();
        System.out.println("Enter the loyaltyTier");
        scan.nextLine();
        String loyaltyTier = scan.nextLine();

        double baseRatePerNight = 0.0;
        if(roomCategory.equals("Standard")){
            baseRatePerNight = 150.0;
        }
        else if(roomCategory.equals("Deluxe")){
            baseRatePerNight = 300.0;
        }
        else if(roomCategory.equals("Suite")){
            baseRatePerNight = 500.0;
        }
        else if(roomCategory.equals("Presidential")){
            baseRatePerNight = 1000.0;
        }

        double seasonalMultiplier = 0.0;
        if(season.equals("Off-Peak")){
            seasonalMultiplier = 0.7;
        }
        else if(season.equals("Regular")){
            seasonalMultiplier = 1.0;
        }
        else if(season.equals("Peak")){
            seasonalMultiplier = 1.5;
        }
        else {
            seasonalMultiplier = 2.0;
        }

        int stayDiscount = 0;
        if(nightsBooked>=1 &&  nightsBooked<=4){
            stayDiscount = 0;
        }
        else if(nightsBooked>=5 &&  nightsBooked<=7){
            stayDiscount = 5;
        }
        else if(nightsBooked>=8 &&  nightsBooked<=14){
            stayDiscount = 10;
        }
        else if(nightsBooked>=15){
            stayDiscount = 20;
        }

        int loyaltDiscount = 0;
        if(loyaltyTier.equals("None")){
            loyaltDiscount = 0;
        }
        else if(loyaltyTier.equals("Member")){
            loyaltDiscount = 10;
        }
        else if(loyaltyTier.equals("Gold")){
            loyaltDiscount = 15;
        }
        else if(loyaltyTier.equals("Platinum")){
            loyaltDiscount = 20;
        }

        double seasonalRate = baseRatePerNight*seasonalMultiplier;
        double discontedRate = seasonalRate*(1-stayDiscount/100.0)*(1-loyaltDiscount/100.0);
        double totalCost = discontedRate*nightsBooked;

        System.out.println("Room Category: "+roomCategory);
        System.out.println("Season: "+season);
        System.out.println("Nights Booked: "+nightsBooked);
        System.out.println("Loyalty Tier: "+loyaltyTier);
        System.out.println("Seasonal Multiplier: "+seasonalMultiplier+"x");
        System.out.println("Extended Stay Discount: "+stayDiscount+"%");
        System.out.println("Loyalty Discount: "+loyaltDiscount+"%");
        System.out.printf("Nightly Rate: $%.2f\n",discontedRate);
        System.out.printf("Total BOoking Cost: $%.2f\n",totalCost);

        String complementary = "";
        if(roomCategory.equals("Deluxe")&& loyaltyTier.equals("None")){
            complementary = "None";
        }
        else if(roomCategory.equals("Suite")&& loyaltyTier.equals("Member")){
            complementary = "Free Breakfast";
        }
        else if(roomCategory.equals("Presidential")&& loyaltyTier.equals("Platinum")){
            complementary = "Concierge service, airport transfer, and fine dining";
        }
        else if(roomCategory.equals("Standard")&& loyaltyTier.equals("None")){
            complementary = "None";
        }
        else if(roomCategory.equals("Deluxe")&& loyaltyTier.equals("Gold")){
            complementary = "Free breakfast and spa access";
        }

        System.out.println("Complimentary Upgrades: "+complementary);
        scan.close();
    }
}
