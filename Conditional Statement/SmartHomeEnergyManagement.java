import java.util.Scanner;

public class SmartHomeEnergyManagement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the timeOfDay");
        String timeOfDay = scan.nextLine();
        System.out.println("Enter the powerConsumption");
        double powerConsumption = scan.nextDouble();
        System.out.println("Enter the renewablePercentage");
        double renewablePercentage = scan.nextDouble();
        System.out.println("Enter the rateTier");
        scan.nextLine();
        String rateTier = scan.nextLine();

        double baseRate = 0.0;
        double potentialSavings = 0.0;
        if (rateTier.equals("Basic")) {
            baseRate = 0.18;
        } 
        else if (rateTier.equals("Time-of-Use")) {
            baseRate = 0.15;
        } 
        else if (rateTier.equals("Premium-Green")) {
            baseRate = 0.12;
        }


        double rateMultiplier = 0.0;
        if (timeOfDay.equals("Peak")) {
            if (rateTier.equals("Time-of-Use")) {
                rateMultiplier = 1.8;
            } else {
                rateMultiplier = 1.5;
            }
        } 
        else if (timeOfDay.equals("Off-Peak")) {
            if (rateTier.equals("Time-of-Use")) {
                rateMultiplier = 0.8;
            } else {
                rateMultiplier = 1.0;
            }
        } 
        else if (timeOfDay.equals("Super-Off-Peak")) {
            if (rateTier.equals("Premium-Green")) {
                rateMultiplier = 0.6;
            } else {
                rateMultiplier = 0.5;
            }
        }


        double renewableCredit = (powerConsumption * renewablePercentage / 100) * baseRate;
        double totalCost = (powerConsumption * baseRate * rateMultiplier) - renewableCredit;

        if (totalCost < 0) {
            totalCost = 0.0;
        }

        String recommendation = "";
        if (timeOfDay.equals("Peak") && renewablePercentage < 30) {
            recommendation = "Shift high-power appliances to Off-Peak hours";
            double offPeakCost = (powerConsumption * baseRate * 0.8) - renewableCredit;
            if (offPeakCost < 0) offPeakCost = 0;
            potentialSavings = totalCost - offPeakCost;
        } 
        else if (renewablePercentage >= 60) {
            recommendation = "Excellent! Maximize appliance use during this period";
            potentialSavings = 0.0;
        } 
        else if (rateTier.equals("Basic") && powerConsumption > 20) {
            recommendation = "Consider upgrading to Time-of-Use plan";
            potentialSavings = powerConsumption * 0.03;
        } 
        else if (renewablePercentage >= 70 && timeOfDay.equals("Peak")) {
            recommendation = "Great renewable usage! Minor peak reduction possible";
            potentialSavings = powerConsumption * baseRate * 0.2;
        } 
        else if (timeOfDay.equals("Off-Peak")) {
            recommendation = "Good timing! Consider increasing renewable capacity";
            potentialSavings = 0.0;
        } 
        else {
            recommendation = "Monitor usage for better optimization";
            potentialSavings = 0.0;
        }

        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + rateMultiplier + "x");
        System.out.printf("Renewable Credit: $%.2f\n", renewableCredit);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.printf("Potential Savings: $%.2f\n", potentialSavings);

        scan.close();
    }
}
