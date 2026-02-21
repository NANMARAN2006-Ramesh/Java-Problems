import java.util.Scanner;

public class MonthlySalesCommission {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        double highest = 0;
        String topPerformer = "";
        double totalAmount = 0.0;
        double totalCommission = 0.0;

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the repName");
            String repName = scan.next();
            System.out.println("Enter the sales amount");
            double salesAmount = scan.nextDouble();

            int commissionRate = 0;


            if (salesAmount <= 40000) {
                commissionRate = 5;
            } 
            else if (salesAmount <= 80000) {
                commissionRate = 8;
            } 
            else if (salesAmount <= 100000) {
                commissionRate = 10;
            } 
            else if (salesAmount <= 150000) {
                commissionRate = 12;
            } 
            else {
                commissionRate = 15;
            }

            double commissionEarned = salesAmount * (commissionRate / 100.0);

            double bonus = 0.0;
            if (salesAmount >= 150000) {
                bonus = 3000;
            } 
            else if (salesAmount >= 100000) {
                bonus = 2000;
            }

            double totalPayout = commissionEarned + bonus;

            totalAmount += salesAmount;
            totalCommission += commissionEarned;

            if (salesAmount > highest) {
                highest = salesAmount;
                topPerformer = repName;
            }

            System.out.println("Sales Rep: " + repName);
            System.out.println("Sales Amount: $" + salesAmount);
            System.out.println("Commission Rate: " + commissionRate + "%");
            System.out.println("Commission Earned: $" + commissionEarned);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + totalPayout);
            System.out.println();
        }

        System.out.println("Total Sales Reps: " + number);
        System.out.println("Total Sales: $" + totalAmount);
        System.out.println("Total Commissions: $" + totalCommission);
        System.out.println("Top Performer: " + topPerformer);

        scan.close();
    }
}