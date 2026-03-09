import java.util.Scanner;

public class SalesPerformanceDashboard {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the rows and cols");
        int rows = s1.nextInt();
        int cols = s1.nextInt();

        int [][] products = new int[rows][cols];
        int [] value = new int[rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                products[i][j] = s1.nextInt();
            }
        }

        int max = 0;
        int maxIndex = -1;
        for(int i=0;i<rows;i++){
            int sum = 0;
            for(int j=0;j<cols;j++){
                sum+=products[i][j];
            }
            value[i] = sum;
            if(sum>max){
                max = sum;
                maxIndex = i+1;
            }
        }

        System.out.println();
        System.out.println("Sales Data: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(products[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Product-Wise Total Sales: ");
        for(int i=0;i<rows;i++){
            System.out.println("Products"+(i+1)+": "+value[i]);
        }
        System.out.println();
        System.out.println("Best-Selling Product: Product"+(maxIndex)+" with "+max+" Units");

        s1.close();
    }
}
