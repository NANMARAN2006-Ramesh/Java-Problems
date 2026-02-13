import java.util.*;
public class RailwayTicketRevenue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the General class passengers:");
        int general = scan.nextInt();
        System.out.println("Enter the General Fare:");
        int generalFare = scan.nextInt();
        System.out.println("Enter the AC class passengers:");
        int acClass = scan.nextInt();
        System.out.println("Enter the AC Fare");
        int acFare = scan.nextInt();
        System.out.println("Enter the Plartform Collection:");
        int plartformCollection = scan.nextInt();
        System.out.println("Enter the Maintenance cost:");
        int maintenance = scan.nextInt();
        System.out.println("Enter the Fuel Cost:");
        int fuel = scan.nextInt();

        int bill = (general*generalFare)+(acClass*acFare)+plartformCollection-maintenance-fuel;
        System.out.println("Net Railway Revenue = "+bill);

    }
}
