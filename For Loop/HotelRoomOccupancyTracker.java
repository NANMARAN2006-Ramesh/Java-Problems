import java.util.Scanner;

public class HotelOccupancyTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of days");
        int N = sc.nextInt();

        double totalOccupancyRate = 0;
        double peakOccupancyRate = -1;
        int peakDay = 0;
        int fullCapacityDays = 0;

        for (int i = 0; i < N; i++) {

            System.out.println("Enter the day");
            int day = sc.nextInt();
            System.out.println("Enter the room occupied");
            int roomsOccupied = sc.nextInt();
            System.out.println("Enter the total rooms");
            int totalRooms = sc.nextInt();

            double occupancyRate = ((double) roomsOccupied / totalRooms) * 100;
            totalOccupancyRate += occupancyRate;

            if (occupancyRate > peakOccupancyRate) {
                peakOccupancyRate = occupancyRate;
                peakDay = day;
            }

            if (occupancyRate == 100.0) {
                fullCapacityDays++;
            }

            String status;
            if (occupancyRate < 60) {
                status = "Low";
            } else if (occupancyRate < 80) {
                status = "Moderate";
            } else if (occupancyRate < 100) {
                status = "High";
            } else {
                status = "Full";
            }

            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + roomsOccupied);
            System.out.println("Total Rooms: " + totalRooms);
            System.out.printf("Occupancy Rate: %.2f%%\n", occupancyRate);
            System.out.println("Status: " + status);
            System.out.println();
        }

        double averageOccupancy = totalOccupancyRate / N;

        System.out.println("Total Days Analyzed: " + N);
        System.out.printf("Average Occupancy Rate: %.2f%%\n", averageOccupancy);
        System.out.println("Peak Occupancy Day: Day " + peakDay);
        System.out.println("Days at Full Capacity: " + fullCapacityDays);

        sc.close();
    }
}