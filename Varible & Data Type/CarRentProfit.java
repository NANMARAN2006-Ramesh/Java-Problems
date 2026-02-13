import java.util.*;
public class CarRentProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rental days:");
        int rentalDay = scan.nextInt();
        System.out.println("Enter the Rentel per Day:");
        int rentalPay = scan.nextInt();
        System.out.println("Enter the Late charges:");
        int lateCharge = scan.nextInt();
        System.out.println("Enter the fuel cost:");
        int fuel = scan.nextInt();
        System.out.println("Enter the maintenance cost");
        int maintenance = scan.nextInt();

        int bill = (rentalDay*rentalPay)+lateCharge-fuel-maintenance;
        System.out.println("Net Profit = "+bill);
    }
}
