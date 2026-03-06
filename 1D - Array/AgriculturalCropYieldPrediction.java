import java.util.Scanner;

public class AgriculturalCropYieldPrediction {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of plots, 1 to 1000");
        int n = s1.nextInt();

        double [] yieldValue = new double[n];
        double total = 0;
        double max = 0;
        int maxIndex = -1;

        System.out.println("Enter the yield value");
        for(int i=0;i<n;i++){
            yieldValue[i] = s1.nextDouble();

            total+=yieldValue[i];
            if(yieldValue[i]>max){
                max = yieldValue[i];
                maxIndex = i+1;
            }
        }
        double avg = total/n;
        double threshold = (avg*0.8);
        int underPerfoming = 0;
        for(int i=0;i<n;i++){
            if(yieldValue[i]<threshold){
                underPerfoming++;
            }
        }
        System.out.println();
        System.out.println("Total Plots: "+n);
        System.out.printf("Total Harvest: %.2f tons\n",total);
        System.out.printf("Average Yield: %.2f tons/acre\n",avg);
        System.out.printf("Highest Yield: %.2f tons/acre (plot %d)\n",max,maxIndex);
        System.out.println("Underperforming Plots: "+underPerfoming);
        System.out.printf("Performance Threshold: %.2f tons/acre",threshold);

        s1.close();
    }
}
