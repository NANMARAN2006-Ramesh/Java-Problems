import java.util.Scanner;

public class WarehouseInventoryHeatmap {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the row and cols");
        int row = s1.nextInt();
        int cols = s1.nextInt();

        int [][] stock = new int[row][cols];

        int total = 0;
        int max = 0;
        int maxRowInd = -1;
        int maxColInd = -1;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                stock[i][j] = s1.nextInt();
                total+=stock[i][j];

                if(stock[i][j]>max){
                    max = stock[i][j];
                    maxRowInd = i;
                    maxColInd = j;
                }
            }
        }
        int totalCount = row*cols;
        double avg = (double)total/totalCount;
        System.out.println();
        System.out.println("Inventory Grid:");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(stock[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Inventory: "+total);
        System.out.printf("Max Stock Zone: Row %d, Col %d (%d Units)\n",maxRowInd,maxColInd,max);
        System.out.printf("Average Stock Per Zone: %.2f",avg);

        s1.close();
    }
}
