import java.util.Scanner;

public class CustomerServiceCallCenterPerformance {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of calls, 1 to 10000");
        int n = s1.nextInt();

        int [] calls = new int[n];

        double total = 0;
        int low = -1;
        int max = 0;
        int target = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            calls[i] = s1.nextInt();

            if(calls[i]<low || low ==-1){
                low = calls[i];
            }
            if(calls[i]>max){
                max = calls[i];
            }
            if(calls[i]>300){
                target++;
            }
            sum = sum+calls[i];
        }

        double avg = (double) sum/n;
        double targetCompliance = ((double)(n-target)/n)*100.0;

        System.out.println("Total Calls: "+n);
        System.out.printf("Average Handling Time: %.2f seconds\n",avg);
        System.out.println("Shortest Call: "+low+" seconds");
        System.out.println("Longest Call: "+max+" seconds");
        System.out.println("Call Exceeding Target (300s): "+target);
        System.out.printf("Target Compliance: %.2f%%",targetCompliance);
    }
}
