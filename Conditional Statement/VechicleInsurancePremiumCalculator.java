import java.util.Scanner;

public class VechicleInsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entet the driver age");
        int driverAge = scan.nextInt();
        System.out.println("Enter the vehicle type");
        scan.nextLine();
        String vehicleType = scan.nextLine();
        System.out.println("Enter the driving record");
        String drivingRecord = scan.nextLine();
        System.out.println("Enter the coverage level");
        String coverageLevel = scan.nextLine();

        double basePremium = 0;
        if (coverageLevel.equals("Basic")) {
            basePremium = 500;
        } else if (coverageLevel.equals("Standard")) {
            basePremium = 800;
        } else if (coverageLevel.equals("Comprehensive")) {
            basePremium = 1500;
        }

        double ageFactor = 0.0;
        if (driverAge >= 16 && driverAge <= 21) {
            ageFactor = 1.8;
        } else if (driverAge >= 22 && driverAge <= 25) {
            ageFactor = 1.5;
        } else if (driverAge >= 26 && driverAge <= 40) {
            ageFactor = 1.0;
        } else if (driverAge >= 41 && driverAge <= 60) {
            ageFactor = 0.9;
        } else {
            ageFactor = 1.1;
        }

        double vehicleRiskFactor = 1.0;
        if (vehicleType.equals("Sedan")) {
            vehicleRiskFactor = 1.0;
        } else if (vehicleType.equals("SUV")) {
            vehicleRiskFactor = 1.2;
        } else if (vehicleType.equals("Sports")) {
            vehicleRiskFactor = 1.5;
        } else if (vehicleType.equals("Truck")) {
            vehicleRiskFactor = 1.1;
        }

        int recordAdjusted = 0;
        if (drivingRecord.equals("Clean")) {
            recordAdjusted = -10;
        } else if (drivingRecord.equals("Minor-Violations")) {
            recordAdjusted = 25;
        } else if (drivingRecord.equals("Major-Violations")) {
            recordAdjusted = 50;
        }

        double adjustedPremium = basePremium * ageFactor * vehicleRiskFactor;
        double finalPremium = adjustedPremium * (1 + recordAdjusted / 100.0);
        double monthlyPremium = finalPremium / 12;

        String riskCategory;
        if (finalPremium < 1000) {
            riskCategory = "Low";
        } else if (finalPremium < 2500) {
            riskCategory = "Medium";
        } else if (finalPremium < 5000) {
            riskCategory = "High";
        } else {
            riskCategory = "Very High";
        }

        System.out.println("Driver Age: " + driverAge);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Driving Record: " + drivingRecord);
        System.out.println("Coverage Level: " + coverageLevel);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Age Factor: " + ageFactor + "x");
        System.out.println("Vehicle Risk Factor: " + vehicleRiskFactor + "x");
        System.out.println("Record Adjustment: " + recordAdjusted + "%");
        System.out.println("Monthly Premium: $" + monthlyPremium);
        System.out.println("Annual Premium: $" + finalPremium);
        System.out.println("Risk Category: " + riskCategory);

        scan.close();
    }
}
