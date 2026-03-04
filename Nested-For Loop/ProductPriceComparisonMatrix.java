import java.util.Scanner;

public class ProductPriceComparisonMatrix {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of products 1 to 8");
        int products = s1.nextInt();
        System.out.println("Enter the number of venders 1 to 6");
        int venders = s1.nextInt();

        String[]product = new String[products];
        double [][] vender = new double[products][venders];
        double [] bestPrice = new double[products];

        double low = 0.0;
        System.out.println("Enter the product name and price");
        for(int i=0;i<products;i++){
            product[i] = s1.next();
            for(int j=0;j<venders;j++){
                vender[i][j] = s1.nextDouble();
                if(vender[i][j]<low || low==0.0){
                    low = vender[i][j];
                    bestPrice[i] = low;
                }
            }
            System.out.println();
        }

        System.out.println("Price Comparision Matrix: ");
        System.out.print("Product ");
        for(int i=1;i<=venders;i++){
            System.out.print("Vendeor"+i+" ");
        }
        System.out.print(" BestPrice");
        System.out.println();
        for(int i=0;i<products;i++){
            System.out.print(product[i]+" ");
            for(int j=0;j<venders;j++){
                System.out.printf("%.2f",vender[i][j]);
                System.out.print(" ");
            }
            System.out.printf(" %.2f",bestPrice[i]);
            System.out.println();
        }
        s1.close();
    }
}
