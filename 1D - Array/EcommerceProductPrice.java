import java.util.Scanner;

public class EcommerceProductPrice{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of serllers");
        int serllers = s1.nextInt();

        double [] price = new double[serllers];

        double max = 0;
        double low = -1;
        double total = 0;
        for(int i=0;i<serllers;i++){
            price[i] = s1.nextDouble();

            if(price[i]>max){
                max = price[i];
            }
            if(price[i]<low || low==-1){
                low = price[i];
            }
            total = total+price[i];
        }

        double diffrence = max - low;
        double savings = (diffrence/max)*100;

        System.out.println("Number of Sellers: "+serllers);
        System.out.printf("Lowest Price: $%.2f\n",low);
        System.out.printf("Highest Price: $%.2f\n",max);
        System.out.printf("Price Difference: $%.2f\n",diffrence);
        System.out.printf("Savings: %.2f%%",savings);
        s1.close();
    }
}