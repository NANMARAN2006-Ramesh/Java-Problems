import java.util.Scanner;

public class AirlineFlightDelayAnalysis {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of flights");
        int n = s1.nextInt();

        int [] delay = new int[n];
        double total = 0;
        int max = 0;
        int ontime = 0;
        int compensation = 0;
        System.out.println("Enter the delay time");
        for(int i=0;i<n;i++){
            delay[i] = s1.nextInt();
            total+=delay[i];

            if(delay[i]>max){
                max = delay[i];
            }
            if(delay[i]<15){
                ontime++;
            }
            if(delay[i]>180){
                compensation++;
            }
        }

        double avg = total/n;
        System.out.println("Total Flights: "+n);
        System.out.printf("Average Delay: %.2f minutes\n",avg);
        System.out.printf("Maximum Delay: %d minutes\n",max);
        System.out.println("On-Time Flights: "+ontime);
        System.out.println("Compensation Required: "+compensation);
        double on_TimePerformance = (ontime/n)*100.0;
        System.out.printf("On-Time Performance: %.2f%%",on_TimePerformance);

        s1.close();
    }
}
