import java.util.*;

public class ParkingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        double totalRevenue = 0;
        int peakCount = 0;
        
        for (int i = 1; i <= N; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();
            
            double rate = 0;
            double cap = 0;
            
            if (type.equals("Car")) {
                rate = 3;
                cap = 30;
            } else if (type.equals("Motorcycle")) {
                rate = 2;
                cap = 20;
            } else if (type.equals("Truck")) {
                rate = 5;
                cap = 60;
            } else if (type.equals("Bus")) {
                rate = 7;
                cap = 100;
            }
            
            double fee = hours * rate;
            boolean capApplied = false;
            
            if (fee > cap) {
                fee = cap;
                capApplied = true;
            }
            
            if (hours > 8)
                peakCount++;
            
            totalRevenue += fee;
            
            System.out.println("Vehicle " + i + ": " + type +
                    " Hours Parked: " + hours +
                    " Hourly Rate: $" + rate +
                    " Parking Fee: $" + fee +
                    " Cap Applied: " + (capApplied ? "Yes" : "No"));
        }
        
        double average = totalRevenue / N;
        
        System.out.println("Total Vehicles: " + N);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fee: $" + average);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakCount);

        sc.close();
    }
}