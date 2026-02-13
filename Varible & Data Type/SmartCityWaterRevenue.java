import java.util.*;
public class SmartCityWaterRevenue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Residential usage");
        long resUsage = scan.nextLong();
        System.out.println("Enter the residential rate");
        long resRate = scan.nextLong();
        System.out.println("Enter the commercial usage");
        long comUsage = scan.nextLong();
        System.out.println("Enter the commercial rate");
        long comRate = scan.nextLong();
        System.out.println("Enter the connection fees");
        long connection = scan.nextLong();
        System.out.println("Enter the penalty collection");
        long penalty = scan.nextLong();
        System.out.println("Enter teh pipeline maintenance");
        long maintenance = scan.nextLong();
        System.out.println("ENter the treatment cost");
        long treatment = scan.nextLong();

        long revenue = (resUsage*resRate)+(comUsage*comRate)+connection+penalty-maintenance-treatment;
        System.out.println("Net Water Revenue = "+revenue);
    }
}
