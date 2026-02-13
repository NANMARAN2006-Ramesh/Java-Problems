import java.util.*;
public class SchoolBusTransportFee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Distance:");
        int distance = scan.nextInt();
        System.out.println("Enter the Rate Per Km:");
        int rate = scan.nextInt();
        System.out.println("Enter the Maintenance:");
        int maintenance = scan.nextInt();
        System.out.println("Enter the driver allowance:");
        int driver = scan.nextInt();
        System.out.println("Enter the Subsidy:");
        int subsidy = scan.nextInt();

        int bill = ((distance*rate)+maintenance+driver)-subsidy;
        System.out.println("Total Transport Fee = "+bill);
    }
}
