import java.util.Scanner;

public class ParkingLotGridVisualizer {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the rows and columns");
        int rows = s1.nextInt();
        int cols = s1.nextInt();
        System.out.println("Enter the occupied seats");
        int occupied = s1.nextInt();

        boolean[][] spots = new boolean[rows][cols];

        for(int i = 0; i < occupied; i++) {
            int r = s1.nextInt();
            int c = s1.nextInt();
            spots[r][c] = true;
        }

        System.out.println("Parking Lot Grid:");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(spots[i][j]) {
                    System.out.print("[O] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }

        int totalSpot = rows * cols;
        int vacant = totalSpot - occupied;
        double occupancyRate = ((double) occupied / totalSpot) * 100;

        System.out.println();
        System.out.println("Total Spots: " + totalSpot);
        System.out.println("Occupied: " + occupied);
        System.out.println("Vacant: " + vacant);
        System.out.printf("Occupancy Rate: %.2f%%", occupancyRate);

        s1.close();
    }
}