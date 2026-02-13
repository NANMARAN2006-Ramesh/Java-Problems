import java.util.*;
public class AirlineCargoRevenue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the weight");
        int weight = scan.nextInt();
        System.out.println("Enter the rate per kg");
        int rate = scan.nextInt();
        System.out.println("Enter the priority charges");
        int priority = scan.nextInt();
        System.out.println("Enter the insurance fees");
        int insurance = scan.nextInt();
        System.out.println("Enter the handling charges");
        int handling = scan.nextInt();
        System.out.println("Enter the fuel charge");
        int fuel = scan.nextInt();

        int revenue = (weight*rate)+priority+insurance-handling-fuel;
        System.out.println("Cargo Revenue = "+revenue);
    }
}
