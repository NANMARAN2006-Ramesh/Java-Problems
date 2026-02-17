import java.util.Scanner;

public class HealthcareInsurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the age");
        int age = scan.nextInt();
        System.out.println("Enter the smokingStatus");
        scan.nextLine(); 
        String smokingStatus = scan.nextLine();
        System.out.println("Enter the preExisting");
        String preExisting = scan.nextLine();
        System.out.println("Enter the coverageTier");
        String coverageTier = scan.nextLine();

        double basePremium = 0.0;
        double riskSurcharge = 0.0;
        if (age >= 18 && age <= 30) { 
            if (coverageTier.equals("Basic")) {
                basePremium = 200.0;
            } else if (coverageTier.equals("Standard")) {
                basePremium = 300.0;
            } else if (coverageTier.equals("Premium")) {
                basePremium = 500.0;
            }
        } 
        else if (age >= 31 && age <= 50) {
            if (coverageTier.equals("Basic")) {
                basePremium = 250.0;
            } else if (coverageTier.equals("Standard")) {
                basePremium = 350.0;
            } else if (coverageTier.equals("Premium")) {
                basePremium = 600.0;
            }
        } 
        else if (age >= 51 && age <= 65) { 
            if (coverageTier.equals("Basic")) {
                basePremium = 350.0;
            } else if (coverageTier.equals("Standard")) {
                basePremium = 450.0;
            } else if (coverageTier.equals("Premium")) {
                basePremium = 700.0;
            }
        } 
        else if (age >= 66) { 
            if (coverageTier.equals("Basic")) {
                basePremium = 400.0;
            } else if (coverageTier.equals("Standard")) {
                basePremium = 550.0;
            } else if (coverageTier.equals("Premium")) {
                basePremium = 800.0;
            }
        }

        
        if (smokingStatus.equals("Smoker") && preExisting.equals("Yes")) {
            riskSurcharge = basePremium * 0.70;
        } 
        else if (smokingStatus.equals("Smoker")) {
            riskSurcharge = basePremium * 0.40;
        } 
        else if (preExisting.equals("Yes")) {
            riskSurcharge = basePremium * 0.30;
        } 
        else {
            riskSurcharge = 0.0;
        }

        double totalPremium = basePremium + riskSurcharge;

        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingStatus);
        System.out.println("Pre-existing Conditions: " + preExisting);
        System.out.println("Coverage Tier: " + coverageTier);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);

        scan.close();
    }
}

