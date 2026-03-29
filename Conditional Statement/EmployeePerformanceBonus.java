import java.util.Scanner;

public class EmployeePerformanceBonus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the performance rating:");
        int performanceRating = scan.nextInt();
        System.out.println("Enter the years of service:");
        int yearsOfService = scan.nextInt();
        System.out.println("Enter the department type:");
        String departmentType = scan.next();
        System.out.println("Enter the base salary:");
        double baseSalary = scan.nextDouble();
        int bonusPercentage = 0;
        double bonusAmount = 0.0;
        String status = "Not Eligible";
        if (performanceRating >= 3) {
            if (departmentType.equals("Critical")) {
                if (performanceRating == 5 && yearsOfService >= 5) {
                    bonusPercentage = 25;
                } 
                else if (performanceRating == 4 && yearsOfService >= 10) {
                    bonusPercentage = 22;
                } 
                else if (performanceRating == 4) {
                    bonusPercentage = 15;
                } 
                else if (performanceRating == 3) {
                    bonusPercentage = 10;
                }

            } else if (departmentType.equals("Non-Critical")) {

                if (performanceRating == 5) {
                    bonusPercentage = 18;
                } 
                else if (performanceRating == 4) {
                    bonusPercentage = 12;
                } 
                else if (performanceRating == 3) {
                    bonusPercentage = 8;
                }
            }
            if (bonusPercentage > 0) {
                status = "Eligible";
                bonusAmount = baseSalary * bonusPercentage / 100.0;
            }
        }
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Department: " + departmentType);
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Bonus Amount: $" + bonusAmount);
        System.out.println("Status: " + status);
        scan.close();
    }
}
