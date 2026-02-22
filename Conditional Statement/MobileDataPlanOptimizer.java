import java.util.Scanner;

public class MobileDataPlanOptimizer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dataGB");
        double dataGB = sc.nextDouble();
        System.out.println("Enter the callMinutes");
        int callMinutes = sc.nextInt();
        System.out.println("Enter the internationalUsage");
        sc.nextLine();
        String internationalUsage = sc.nextLine();
        System.out.println("Enter the deviceType");
        String deviceType = sc.nextLine();

        String recommendedPlan = "";
        String planCategory = "";

        double baseCost = 0.0;
        double dataOverage = 0.0;
        double callOverage = 0.0;
        double internationalFee = 0.0;
        double deviceFee = 0.0;
        double potentialSavings = 0.0;

        if (dataGB <= 2 && callMinutes <= 500) {
            recommendedPlan = "Basic 2GB";
            baseCost = 25.0;
            planCategory = "Budget";
        } else if (dataGB <= 5 && callMinutes <= 1000) {
            recommendedPlan = "Standard 5GB";
            baseCost = 40.0;
            planCategory = "Standard";
        } else if (dataGB <= 30 && callMinutes <= 2000) {
            recommendedPlan = "Premium Unlimited";
            baseCost = 70.0;
            planCategory = "Premium";
        } else {
            recommendedPlan = "Unlimited Max";
            baseCost = 90.0;
            planCategory = "Unlimited";
        }

        if (recommendedPlan.equals("Basic 2GB")) {
            if (dataGB > 2) {
                dataOverage = (dataGB - 2) * 10;
            }
            if (callMinutes > 500) {
                callOverage = (callMinutes - 500) * 0.10;
            }
        } else if (recommendedPlan.equals("Standard 5GB")) {
            if (dataGB > 5) {
                dataOverage = (dataGB - 5) * 10;
                potentialSavings = 5.0;
            }
            if (callMinutes > 1000) {
                callOverage = (callMinutes - 1000) * 0.10;
            }
        }

        if (internationalUsage.equalsIgnoreCase("None")) {
            internationalFee = 0.0;
        } else if (internationalUsage.equalsIgnoreCase("Light")) {
            internationalFee = 5.0;
        } else if (internationalUsage.equalsIgnoreCase("Moderate")) {
            internationalFee = 15.0;
        } else if (internationalUsage.equalsIgnoreCase("Heavy")) {
            internationalFee = 30.0;
        }

        if (deviceType.equalsIgnoreCase("Basic")) {
            deviceFee = 0.0;
        } else if (deviceType.equalsIgnoreCase("Smartphone")) {
            deviceFee = 10.0;
        } else if (deviceType.equalsIgnoreCase("Tablet")) {
            deviceFee = 10.0;
        } else if (deviceType.equalsIgnoreCase("Hotspot")) {
            deviceFee = 20.0;
        }

        double totalCost = baseCost + dataOverage + callOverage + internationalFee + deviceFee;

        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + internationalUsage);
        System.out.println("Device Type: " + deviceType);
        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + totalCost);
        System.out.println("Potential Savings: $" + potentialSavings);
        System.out.println("Plan Category: " + planCategory);

        sc.close();
    }
}