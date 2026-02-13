import java.util.*;
public class CinemaTheatreCollection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Ticket Revenue:");
        int ticketRevenue = scan.nextInt();
        System.out.println("Enter the Snack Revenue:");
        int snackRevenue = scan.nextInt();
        System.out.println("Enter the Maintenance Cost:");
        int maintenanceCost = scan.nextInt();
        System.out.println("Enter the Electricity Bill:");
        int electricityBill = scan.nextInt();

        int bill = ((ticketRevenue+snackRevenue)-maintenanceCost-electricityBill);
        System.out.println("Net Profit = "+bill);
    }
}
