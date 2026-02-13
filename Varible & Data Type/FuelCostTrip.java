import java.util.Scanner;
public class FuelCostTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Total Distance: ");
        int dis = scan.nextInt();
        System.out.println("Enter the Vehicle Mileage: ");
        int mileage = scan.nextInt();
        System.out.println("Enter the Fuel Price: ");
        int fuel = scan.nextInt();
        System.out.println("Enter the Till Charge: ");
        int toll = scan.nextInt();

        int fuelAmt = (dis/mileage)*fuel;
        int bill = fuelAmt+toll;
        System.out.println("Total Trip Cost = "+bill); 

    }
}
