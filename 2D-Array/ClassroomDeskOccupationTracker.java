import java.util.Scanner;

public class ClassroomDeskOccupationTracker{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the row and col");
        int row = s1.nextInt();
        int col = s1.nextInt();

        int count = 0;
        int [][] seatOccupancy = new int[row][col];
        int rowCount = 0;
        int [] emptyRow = new int[row];
        for(int i=0;i<row;i++){
            int empty = 0;
            for(int j=0;j<col;j++){
                seatOccupancy[i][j] = s1.nextInt();

                if(seatOccupancy[i][j]==1){
                    empty++;
                    count++;
                }
            }
            if(empty==0){
                emptyRow[rowCount] = i;
                rowCount++;
            }
        }

        System.out.println();
        System.out.println("Seating Map: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(seatOccupancy[i][j]+" ");
            }
            System.out.println();
        }
        double total = row*col;
        double occupancyRate = ((double)count/total)*100;
        System.out.println();
        System.out.println("Total Occupied: "+count);
        System.out.printf("Occupancy Rate: %.2f%%\n",occupancyRate);
        System.out.print("Empty Rows: [");
        for(int i=0;i<rowCount;i++){
           if(i==rowCount-1){
            System.out.print(emptyRow[i]);
           }
           else{
            System.out.print(emptyRow[i]+", ");
           }
        }
        System.out.print("]");

        s1.close();
    }
}