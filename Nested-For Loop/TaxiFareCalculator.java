import java.util.Scanner;

public class TaxiFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rides (1 to 50)");
        int N = sc.nextInt();

        double totalDistance = 0.0;
        double totalRevenue = 0.0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter the total distance km");
            double distance = sc.nextDouble();
            System.out.println("Enter the timeOfDay");
            String timeOfDay = sc.next();

            double baseFare = 3.0;
            double distanceCharge = distance * 1.0;
            double timeSurcharge = 0.0;
            if (timeOfDay.equals("Evening")) {
                timeSurcharge = 3.0;
            } else if (timeOfDay.equals("Night")) {
                timeSurcharge = 5.0;
            }
            double totalFare = baseFare + distanceCharge + timeSurcharge;
            totalDistance += distance;
            totalRevenue += totalFare;
            System.out.println("Ride " + i);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Time: " + timeOfDay);
            System.out.println("Base Fare: $" + baseFare);
            System.out.println("Distance Charge: $" + distanceCharge);
            System.out.println("Time Surcharge: $" + timeSurcharge);
            System.out.println("Total Fare: $" + totalFare);
            System.out.println();
        }

        double averageFare = N > 0 ? totalRevenue / N : 0.0;
        averageFare = Math.round(averageFare * 100.0) / 100.0;
        System.out.println("Total Rides: " + N);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fare: $" + averageFare);

        sc.close();
    }
}
