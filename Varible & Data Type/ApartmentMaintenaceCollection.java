import java.util.*;
public class ApartmentMaintenaceCollection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the maintenance collection");
        int maintenance = scan.nextInt();
        System.out.println("Enter the parking fees");
        int parking = scan.nextInt();
        System.out.println("Enter the hall booking");
        int hallBooking = scan.nextInt();
        System.out.println("Enter the security salary");
        int security = scan.nextInt();
        System.out.println("Enter the electricity bill");
        int electricity = scan.nextInt();
        System.out.println("Enter the cleaning cost");
        int cleaning = scan.nextInt();

        int remaining = maintenance+parking+hallBooking-security-electricity-cleaning;
        System.out.println("Remaining Balance = "+remaining);
    }
}
