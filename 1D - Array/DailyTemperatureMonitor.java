import java.util.Scanner;

public class DailyTemperatureMonitor{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of readings");
        int numberOfReading = s1.nextInt();
        
        double [] temperature = new double[numberOfReading];
        
        double max = 0;
        double min = -1;
        double total = 0;
        for(int i=0;i<numberOfReading;i++){
            temperature[i] = s1.nextDouble();

            if(temperature[i]>max){
                max = temperature[i];
            }
            if(temperature[i]<min || min==-1){
                min = temperature[i];
            }
            total = total+temperature[i];
        }
        double termpRange = max-min;
        double avg = total/numberOfReading;

        System.out.println("Number of Readings: "+numberOfReading);
        System.out.printf("Maximum Termperature: %.2f\n",max);
        System.out.printf("Minimum Temperature: %.2f\n",min);
        System.out.printf("Temperature Range: %.2f\n",termpRange);
        System.out.printf("Average Temperature: %.2f\n",avg);
        s1.close();
    }
}