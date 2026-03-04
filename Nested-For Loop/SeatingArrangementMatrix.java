import java.util.Scanner;

public class SeatingArrangementMatrix {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of rows, 1 to 20");
        int rows = s1.nextInt();
        System.out.println("Enter the seats Per Row, 1 to 30");
        int seatsPerRow = s1.nextInt();

        for(int i=1;i<=rows;i++){
            System.out.print("Row "+i+": ");
            for(int j=1;j<=seatsPerRow;j++){
                System.out.print("Seat-"+j+" ");
            }
            System.out.println();
        }
        s1.close();
    }
}
