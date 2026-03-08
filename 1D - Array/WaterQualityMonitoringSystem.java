import java.util.Scanner;

public class WaterQualityMonitoringSystem {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of samples");
        int n = s1.nextInt();

        double [] samples = new double[n];

        double total = 0;
        double min = -1;
        double max = 0;
        int unsafe = 0;
        int [] critical = new int[n];

        System.out.println("Enter the sample values fo pH");
        for(int i=0;i<n;i++){
            samples[i] = s1.nextDouble();

            total+=samples[i];

            if(samples[i]<min || min==-1){
                min = samples[i];
            }
            if(samples[i]>max){
                max = samples[i];
            }
            if(samples[i]<6.5 || samples[i]>8.5){
                critical[unsafe] = i+1;
                unsafe++;
            }
        }

        double avg = total/n;
        double safetyCompliance = ((double)(n-unsafe)/n)*100;

        System.out.println("Total Samples: "+n);
        System.out.printf("Average pH: %.2f\n",avg);
        System.out.printf("Minimu pH: %.2f\n",min);
        System.out.printf("Maximum pH: %.2f\n",max);
        System.out.println("Unsafe Samples: "+unsafe);
        System.out.printf("Safety Compliance: %.2f%%\n",safetyCompliance);
        System.out.printf("Critical Alerts: [");
        for(int i=0;i<unsafe;i++){
            if(i==unsafe-1){
                System.out.print(critical[i]);
            }
            else{
                System.out.print(critical[i]+", ");
            }
        }
        System.out.print("]");
    }
}
