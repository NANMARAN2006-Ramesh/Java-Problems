import java.util.*;
public class DeliveryServiceEarnings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Deliveries: ");
        int delivery = scan.nextInt();
        System.out.println("Enter the Pay for delivery:");
        int pay = scan.nextInt();
        System.out.println("Enter the Incentive:");
        int incentive = scan.nextInt();
        System.out.println("Enter the fuel cost:");
        int fuel = scan.nextInt();

        int bill = ((delivery*pay)+(incentive))-fuel;
        System.out.println("Deliver Earnings = "+bill);
    }
}
