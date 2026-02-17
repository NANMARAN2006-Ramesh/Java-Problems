import java.util.Scanner;

public class EstatePropertyValuation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Location tier");
        String locationTier = scan.nextLine();
        System.out.println("Enter the square footage");
        int squartFootage = scan.nextInt();
        System.out.println("Enter the Property age");
        int propertyAge = scan.nextInt();
        System.out.println("Enter the amenity score");
        int amenityScore = scan.nextInt();

        int basePrice = 0;

        if(locationTier.equals("Prime")){
            basePrice = 400;
        }
        else if(locationTier.equals("Urban")){
            basePrice = 300;
        }
        else if(locationTier.equals("Suburban")){
            basePrice = 180;
        }
        else{
            basePrice = 100;
        }

        int ageAdjustment = 0;

        if(propertyAge >= 0 && propertyAge <= 5){
            ageAdjustment = 0;
        }
        else if(propertyAge >= 6 && propertyAge <= 15){
            ageAdjustment = -10;
        }
        else if(propertyAge >= 16 && propertyAge <= 30){
            ageAdjustment = -20;
        }
        else{
            ageAdjustment = -35;
        }

        double baseValue = squartFootage * basePrice;
        double amenityBonus = 0;

        if(amenityScore >= 80 && amenityScore <= 100){
            amenityBonus = baseValue * 0.10;
        }
        else if(amenityScore >= 60 && amenityScore <= 79){
            amenityBonus = baseValue * 0.05;
        }
        else if(amenityScore >= 40 && amenityScore <= 59){
            amenityBonus = baseValue * 0.02;
        }
        else{
            amenityBonus = 0;
        }

        double adjustedValue = baseValue * (1 + ageAdjustment / 100.0);
        double finalAdjustValue = adjustedValue + amenityBonus;

        System.out.println("Location Tier: " + locationTier);
        System.out.println("Square Footage: " + squartFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + basePrice);
        System.out.println("Age Adjustment: " + ageAdjustment + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalAdjustValue);

        if((locationTier.equals("Prime") || locationTier.equals("Urban")) && propertyAge < 15){
            System.out.println("Market Category: Hot");
        }
        else if(locationTier.equals("Suburban")){
            System.out.println("Market Category: Stable");
        }
        else{
            System.out.println("Market Category: Slow");
        }

        scan.close();
    }
}
