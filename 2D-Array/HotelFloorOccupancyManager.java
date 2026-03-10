import java.util.Scanner;

public class HotelFloorOccupancyManager{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of floors");
        int floors = s1.nextInt();

        int [][] rooms = new int[floors][];
        int [] occupancy = new int[floors];
        int max = -1;
        int maxIndex = -1;
        for(int i=0;i<floors;i++){
            int sum = 0;
            int n = s1.nextInt();
            rooms[i] = new int[n];
            for(int j=0;j<n;j++){
                rooms[i][j] = s1.nextInt();

                if(rooms[i][j]==1){
                    sum+=1;
                }
            }
            occupancy[i] = sum;
            if(sum>max){
                max = sum;
                maxIndex = i+1;
            }
        }

        System.out.println();
        System.out.println("Hotel Status: ");
        for(int i=0;i<floors;i++){
            System.out.print("Floor "+(i+1)+": ");
            for(int j=0;j<rooms[i].length;j++){
                System.out.print(rooms[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Occupancy Report");
        for(int i=0;i<floors;i++){
            System.out.print("Floor "+(i+1)+" : ");
            for(int j=i;j<=i;j++){
                System.out.print(occupancy[i]+" occupied");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Busiest Floor: Floor "+maxIndex+" ("+max+" rooms occupied )");
        s1.close();
    }
}