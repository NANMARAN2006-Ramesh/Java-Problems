import java.util.Scanner;

public class E_CommerceDynamicDiscount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the LoyaltyTier:");
        String loyaltyTier = scan.nextLine();
        System.out.println("Enter the cartValue: ");
        double cartValue = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the productCategory: ");
        String productCategory = scan.nextLine();
        System.out.println("Enter the membershipStatus: ");
        String membershipStatus = scan.nextLine();

        double baseDiscount = 0;

        if (loyaltyTier.equals("Bronze")) {
            baseDiscount = 5;
        } 
        else if (loyaltyTier.equals("Silver")) {
            baseDiscount = 8;
        } 
        else if (loyaltyTier.equals("Gold")) {
            baseDiscount = 12;
        } 
        else if (loyaltyTier.equals("Platinum")) {
            baseDiscount = 15;
        }
        double additionalDiscount = 0;

        if (cartValue >= 500 && cartValue <= 999) {
            additionalDiscount = 3;
        } 
        else if (cartValue >= 1000 && cartValue <= 1999) {
            additionalDiscount = 5;
        } 
        else if (cartValue >= 2000) {
            additionalDiscount = 7;
        }

        double bonusDiscount = 0;

        if (productCategory.equals("Electronics") && membershipStatus.equals("Prime")) {
            bonusDiscount = 5;
        } 
        else if (productCategory.equals("Fashion")) {
            bonusDiscount = 3;
        } 
        else if (productCategory.equals("Books") && membershipStatus.equals("Prime")) {
            bonusDiscount = 5;
        } 
        else if (productCategory.equals("Groceries") && cartValue > 300) {
            bonusDiscount = 2;
        }

        double totalDiscount = baseDiscount + additionalDiscount + bonusDiscount;
        double finalPrice = cartValue * (1 - totalDiscount / 100);
        double savings = cartValue - finalPrice;

        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Cart Value: $" + cartValue);
        System.out.println("Product Category: " + productCategory);
        System.out.println("Membership: " + membershipStatus);
        System.out.println("Base Discount: " + (int)baseDiscount + "%");
        System.out.println("Additional Discount: " + (int)(additionalDiscount + bonusDiscount) + "%");
        System.out.println("Total Discount: " + (int)totalDiscount + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Savings: $" + savings);

        scan.close();
    }
}

