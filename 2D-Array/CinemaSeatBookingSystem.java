import java.util.Scanner;

public class CinemaSeatBookingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row and cols");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("Enter the number of booking seats");
        int bookings = sc.nextInt();

        boolean[][] seats = new boolean[rows][cols];
        for(int i = 0; i < bookings; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            seats[r][c] = true;
        }

        System.out.println("Seating Chart:");
        int booked = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(seats[i][j]==true){
                    System.out.print("B ");
                    booked++;
                } 
                else {
                    System.out.print("A ");
                }
            }
            System.out.println();
        }

        int total = rows * cols;
        int available = total - booked;
        double occupancy = ((double) booked / total) * 100;
        System.out.println();
        System.out.println("Total Seats: " + total);
        System.out.println("Booked Seats: " + booked);
        System.out.println("Available Seats: " + available);
        System.out.printf("Occupancy Rate: %.2f%%", occupancy);

        sc.close();
    }
}