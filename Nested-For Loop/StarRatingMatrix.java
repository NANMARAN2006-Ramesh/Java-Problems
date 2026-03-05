import java.util.*;
public class StarRatingMatrix {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of products");
        int products = s1.nextInt();

        String [] productList = new String[products];
        double [] rating = new double[products];

        System.out.println("Enter the product name after rating");
        for(int i=0;i<products;i++){
            productList[i] = s1.next();
            rating [i]= s1.nextDouble();
        }

        double value = 0.0;
        System.out.println();
        System.out.println("Star Rating Matrix: ");
        System.out.println("Product Rating Stars");
        for(int i = 0;i<products;i++){
            int count = 0;
            System.out.print(productList[i]+ " ");
            System.out.print(rating[i]+" ");
            value = value+rating[i];
            for(int k=1;k<=(int)rating[i];k++){
                System.out.print("* ");
                count++;
            }
            for(int l=count+1;l<=5;l++){
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.printf("Average Rating: %.2f",(value/products));

        s1.close();
    }
}
