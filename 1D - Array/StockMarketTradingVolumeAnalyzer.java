import java.util.Scanner;

public class StockMarketTradingVolumeAnalyzer {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of trading days");
        int n = s1.nextInt();

        int [] volume = new int[n];
        int total = 0;
        int high = -1;
        int highIndex = -1;
        System.out.println("Enter the trading volume");
        for(int i = 0;i<n;i++){
            volume[i] = s1.nextInt();

            total+= volume[i];
            if(volume[i]>high){
                high = volume[i];
                highIndex = i+1;
            }
                 
        }
        int avg = total/n;      
        double highVolume = avg*1.5;
        int [] breakOutDays = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(volume[i]>highVolume){
                breakOutDays[count] = i+1;
                count++;
            }
        }
        System.out.println("Trading Days Analyzed: "+n);
        System.out.println("Total Volume: "+total);
        System.out.println("Average Volume: "+avg);
        System.out.printf("Peak Volume Day: Day %d (%d)\n",highIndex,high);
        System.out.println("High Volume Days (>150% avg): "+count);
        System.out.print("Breakout Signal Days: [");
        for(int i=0;i<count;i++){
            if(i==count-1){
                System.out.print(breakOutDays[i]);
            }
            else{
                System.out.print(breakOutDays[i]+", ");
            }
        }
        System.out.print("]");
    }
}
