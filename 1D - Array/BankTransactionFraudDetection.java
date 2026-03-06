import java.util.Scanner;

public class BankTransactionFraudDetection {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the total Transation");
        int total = s1.nextInt();

        double [] values = new double[total];
        double sum = 0;
        for(int i=0;i<total;i++){
            values[i] = s1.nextDouble();

            sum = sum+values[i];
        }
        double avg = sum/total;
        double threshold = avg*2;
        int count = 0;
        int [] index = new int[total];
        for(int i=0;i<total;i++){
            if(values[i]>threshold){
                index[count] = i;
                count++;
            }
        }

        System.out.println("Total Transaction: "+total);
        System.out.printf("Average Transaction: $%.2f\n",avg);
        System.out.println("Suspicious Transactions: "+count);
        System.out.print("Fraud Alert Indices: [");
        for(int i=0;i<count;i++){
            System.out.print(index[i]+" ");
        }
        System.out.print("]");
        s1.close();
    }
}
