import java.util.Scanner;

public class InventoryStockLevelTracker {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number products");
        int numberOfProduct = s1.nextInt();
        System.out.println("Enter the Minimum Threshold");
        int minimumThreshold = s1.nextInt();

        int count = 0;
        int [] products = new int[numberOfProduct];
        int [] indexes = new int[numberOfProduct];

        for(int i=0;i<numberOfProduct;i++){
            products[i] = s1.nextInt();
            if(products[i] < minimumThreshold){
                indexes[count] = i;
                count++;
            }
        }

        System.out.println("Total Products: "+numberOfProduct);
        System.out.println("Minimum Threshold: "+minimumThreshold);
        System.out.println("Low Stack Products: "+count);
        System.out.print("Product Indices: [");
        for(int i=0;i<count;i++){
            System.out.print(indexes[i]+" ");
        }
        System.out.print("]");
        s1.close();
    }
}
