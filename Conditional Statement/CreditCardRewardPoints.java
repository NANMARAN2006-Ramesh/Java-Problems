import java.util.Scanner;

public class CreditCardRewardPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cardTier");
        String cardTier = scan.nextLine();
        System.out.println("Enter the purchaseCategory");
        String purchaseCategory = scan.nextLine();
        System.out.println("Enter the transactionAmount");
        double transactionAmount = scan.nextDouble();
        System.out.println("Enter the promotionalStatus");
        scan.nextLine();
        String promotionalStatus = scan.nextLine();

        double basePointRate = 1.0;

        double categoryBonus = 0.0;
        if(purchaseCategory.equals("Groceries")){
            categoryBonus = 2.0;
        }
        else if(purchaseCategory.equals("Dining")){
            categoryBonus = 2.5;
        }
        else if(purchaseCategory.equals("Travel")){
            categoryBonus = 3.0;
        }
        else if(purchaseCategory.equals("Gas")){
            categoryBonus = 2.0;
        }
        else{
            categoryBonus = 1.0;
        }

        double tierMultiplier = 0.0;
        if (cardTier.equals("Basic")) {
            tierMultiplier = 1.0;
        }
        else if(cardTier.equals("Gold")){
            tierMultiplier = 1.25;
        }
        else if(cardTier.equals("Platinum")){
            tierMultiplier = 1.5;
        }
        else if(cardTier.equals("Black")){
            tierMultiplier = 2.0;
        }

        double promotionalMultiplier = 0.0;
        if (promotionalStatus.equals("None")) {
            promotionalMultiplier = 1.0;
        }
        else if(promotionalStatus.equals("Double-Points")) {
            promotionalMultiplier = 2.0;
        }
        else if(promotionalStatus.equals("Triple-Points")) {
            promotionalMultiplier = 3.0;
        }

        double pointedEarned = transactionAmount*basePointRate*categoryBonus*tierMultiplier*promotionalMultiplier;
        double cashValue = pointedEarned*0.01;

        String rewardTier = "";
        if(cardTier.equals("Platinum")){
            rewardTier = "Premium";
        }
        else if(cardTier.equals("Gold")){
            rewardTier = "Enhanced";
        }
        else if(cardTier.equals("Black")){
            rewardTier = "Elite";
        }
        else if(cardTier.equals("Basic")){
            rewardTier = "Standard";
        }

        System.out.println("Care Tier: "+cardTier);
        System.out.println("Purchase category: "+purchaseCategory);
        System.out.println("Transaction Amount: $"+transactionAmount);
        System.out.println("Promotional Status: "+promotionalStatus);
        System.out.println("Base Points Rate: "+basePointRate+" points per dollar");
        System.out.println("Category Bonus: "+categoryBonus+"x");
        System.out.println("Tier Multiplier: "+tierMultiplier);
        System.out.println("Promotional Multiplier: "+promotionalMultiplier+"x");
        System.out.println("Points Earned: "+pointedEarned);
        System.out.printf("Equivalent Cash Value: $%.2f\n",cashValue);
        System.out.println("Rewards Tier: "+rewardTier);

        scan.close();
    }
}
