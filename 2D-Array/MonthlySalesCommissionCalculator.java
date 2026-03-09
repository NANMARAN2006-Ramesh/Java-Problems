import java.util.Scanner;

public class MonthlySalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the row and col");
        int row = s1.nextInt();
        int col = s1.nextInt();

        int [][] sales = new int[row][col];
        int [] value = new int[row];

        for(int i=0;i<row;i++){
            int sum = 0;
            for(int j=0;j<col;j++){
                sales[i][j] = s1.nextInt();

                sum+=sales[i][j];
            }
            value[i] = sum;
        }

        int [] teritory = new int[col];
        
        for(int j=0;j<col;j++){
            int sum = 0;
            for(int i=0;i<row;i++){
                sum += sales[i][j];
            }
            teritory[j] = sum;
        }
        System.out.println();
        System.out.println("Sales Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(sales[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Representative Totals: ");
        for(int i=0;i<row;i++){
            System.out.println("Rep "+(i+1)+": "+value[i]);
        }
        System.out.println();
        System.out.println("Teritory Totals: ");
        for(int i=0;i<col;i++){
            System.out.println("Teritory "+(i+1)+": "+teritory[i]);
        }
        s1.close();
    }
}
