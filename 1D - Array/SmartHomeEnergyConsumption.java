import java.util.Scanner;

public class SmartHomeEnergyConsumption {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of hours, typically 24");
        int n = s1.nextInt();

        double [] hourlyConsumption = new double[n];
        System.out.println("Enter the hourly consumption");
        double total = 0;
        double max = 0;
        int maxIndex = -1;
        for(int i=0;i<n;i++){
            hourlyConsumption[i] = s1.nextDouble();

            total = total+hourlyConsumption[i];
            if(hourlyConsumption[i]>max){
                max = hourlyConsumption[i];
                maxIndex = i+1;
            }
        }
        System.out.println("Enter the daily limit");
        double dailyLimit = s1.nextDouble();
        double avg = total/(double)n;
        System.out.println("Hours Monitored: "+n);
        System.out.printf("Total Daliy Consumption: %.2f kWh\n",total);
        System.out.printf("Peak Hour: Hour %d (%.2f kWh)\n",maxIndex,max);
        System.out.printf("Average Hourly: %.2f kWh\n",avg);
        System.out.printf("Daily Limit: %.2f kWh\n",dailyLimit);
        if(total<=dailyLimit){
            System.out.println("Status: Within Limit");
        }
        else{
            System.out.printf("Status: Exceeded by %.2f kWh",total-dailyLimit);
        }
        s1.close();
    }
}
