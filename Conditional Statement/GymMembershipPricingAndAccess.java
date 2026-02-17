import java.util.Scanner;

public class GymMembershipPricingAndAccess {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the membershipTier");
        String membershipTier = scan.nextLine();
        System.out.println("Enter the contractMonths");
        int contractMonths = scan.nextInt();
        System.out.println("Enter the accessLevel");
        scan.nextLine(); 
        String accessLevel = scan.nextLine();
        System.out.println("Enter the addOns");
        String addOns = scan.nextLine();


        double baseFee = 0.0;

        if (membershipTier.equals("Basic")) {
            baseFee = 40.0;
        } 
        else if (membershipTier.equals("Premium")) {
            baseFee = 80.0;
        } 
        else if (membershipTier.equals("Elite")) {
            baseFee = 120.0;
        } 
        else if (membershipTier.equals("VIP")) {
            baseFee = 150.0;
        }


        double contractDiscount = 0.0;

        if (contractMonths == 1) {
            contractDiscount = 0;
        } 
        else if (contractMonths == 6) {
            contractDiscount = 10;
        } 
        else if (contractMonths == 12) {
            contractDiscount = 15;
        } 
        else if (contractMonths == 24) {
            contractDiscount = 25;
        }


        double accessFee = 0.0;

        if (accessLevel.equals("Single-Location")) {
            accessFee = 0;
        } 
        else if (accessLevel.equals("Regional")) {
            accessFee = 20;
        } 
        else if (accessLevel.equals("Nationwide")) {
            accessFee = 50;
        }


        double addOnFee = 0.0;

        if (addOns.equals("None")) {
            addOnFee = 0;
        } 
        else if (addOns.equals("Personal-Training")) {
            addOnFee = 100;
        } 
        else if (addOns.equals("Classes")) {
            addOnFee = 50;
        } 
        else if (addOns.equals("Full-Package")) {
            addOnFee = 200;
        }


        double discountedBase = baseFee * (1 - contractDiscount / 100.0);
        double monthlyTotal = discountedBase + accessFee + addOnFee;
        double contractTotal = monthlyTotal * contractMonths;

        double savings = ((baseFee + accessFee + addOnFee) * contractMonths) - contractTotal;


        String category;

        if (monthlyTotal < 50) {
            category = "Budget";
        } 
        else if (monthlyTotal < 120) {
            category = "Standard";
        } 
        else if (monthlyTotal < 200) {
            category = "Premium";
        } 
        else {
            category = "Luxury";
        }

        System.out.println("Membership Tier: " + membershipTier);
        System.out.println("Contract Length: " + contractMonths + " months");
        System.out.println("Access Level: " + accessLevel);
        System.out.println("Add-Ons: " + addOns);
        System.out.println("Base Monthly Fee: $" + baseFee);
        System.out.println("Contract Discount: " + contractDiscount + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addOnFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + savings);
        System.out.println("Membership Category: " + category);

        scan.close();
    }
}
