import java.util.Scanner;

public class RetailSalesPerformanceDashboard {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of stores 1 to 1000");
        int stores = s1.nextInt();

        double [] sales = new double[stores];

        double max = 0;
        double low = -1;
        double total = 0;
        int maxIndex = -1;
        int lowIndex = -1;
        for(int i=0;i<stores;i++){
            sales[i] = s1.nextDouble();

            if(sales[i]>max){
                max = sales[i];
                maxIndex = i+1;
            }
            if(sales[i]<low || low==-1){
                low = sales[i];
                lowIndex = i+1;
            }
            total = total+sales[i];
        }

        double avg = total/stores;

        System.out.println("Total Stores: "+stores);
        System.out.println("Highest Sales: $"+max+"(Store "+maxIndex+")");
        System.out.println("Lowest Sales: $"+low+"(Store "+lowIndex+")");
        System.out.printf("Total Sales: $%.2f\n",total);
        System.out.printf("Average Sales: $%.2f\n",avg);

        s1.close();
    }
}
