import java.util.Scanner;

public class SoftwareLicensePricingCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the user count");
        int userCount = scan.nextInt();
        System.out.println("Enter the license Type");
        scan.nextLine();
        String licenseType = scan.nextLine();
        System.out.println("Enter the supportLevel");
        String supportLevel = scan.nextLine();
        System.out.println("Enter the contractYears");
        int contractYears = scan.nextInt();

        double basePrice = 0.0;
        if (licenseType.equals("Standard")) {
            basePrice = 60.0;
        } else if (licenseType.equals("Professional")) {
            basePrice = 120.0;
        } else if (licenseType.equals("Enterprise")) {
            basePrice = 200.0;
        }

        int volumeDiscount = 0;
        if (userCount <= 50) {
            volumeDiscount = 0;
        } else if (userCount <= 200) {
            volumeDiscount = 15;
        } else if (userCount <= 500) {
            volumeDiscount = 20;
        } else if (userCount <= 1000) {
            volumeDiscount = 25;
        } else {
            volumeDiscount = 35;
        }

        double supportFeePerUser = 0.0;
        if (supportLevel.equals("Basic")) {
            supportFeePerUser = 10.0;
        } else if (supportLevel.equals("Priority")) {
            supportFeePerUser = 30.0;
        } else if (supportLevel.equals("Premium")) {
            supportFeePerUser = 80.0;
        }

        int multiYearDiscount = 0;
        if (contractYears == 2) {
            multiYearDiscount = 5;
        } else if (contractYears == 3) {
            multiYearDiscount = 10;
        } else if (contractYears == 5) {
            multiYearDiscount = 20;
        }

        double discountedBase = basePrice * (1 - volumeDiscount / 100.0);
        double annualPerUser = (discountedBase + supportFeePerUser) * (1 - multiYearDiscount / 100.0);
        double totalAnnual = annualPerUser * userCount;
        double contractValue = totalAnnual * contractYears;

        String pricingTier;
        if (userCount < 200) {
            pricingTier = "Small Business";
        } else if (userCount <= 1000) {
            pricingTier = "Mid-Market";
        } else {
            pricingTier = "Enterprise";
        }

        System.out.println("User Count: " + userCount);
        System.out.println("License Type: " + licenseType);
        System.out.println("Support Level: " + supportLevel);
        System.out.println("Contract Duration: " + contractYears + " years");
        System.out.println("Base Price Per User: $" + basePrice);
        System.out.println("Volume Discount: " + volumeDiscount + "%");
        System.out.println("Support Fee Per User: $" + supportFeePerUser);
        System.out.println("Multi-Year Discount: " + multiYearDiscount + "%");
        System.out.println("Annual Cost Per User: $" + annualPerUser);
        System.out.println("Total Annual Cost: $" + totalAnnual);
        System.out.println("Total Contract Value: $" + contractValue);
        System.out.println("Pricing Tier: " + pricingTier);

        scan.close();
    }
}
