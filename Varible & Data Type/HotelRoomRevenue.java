import java.util.*;
public class HotelRoomRevenue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Room Booked:");
        int rooms = scan.nextInt();
        System.out.println("Enter the Price per Room:");
        int price = scan.nextInt();
        System.out.println("Enter the Service Charges:");
        int serviceCharge = scan.nextInt();
        System.out.println("Enter the Commission Amout:");
        int commission = scan.nextInt();

        int bill = (rooms*price)+serviceCharge-commission;
        System.out.println("Total Revenue = "+bill);
    }
}
