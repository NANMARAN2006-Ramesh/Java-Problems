import java.util.Scanner;

public class FitnessTrackerCalorieBurnAnalyzer {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of days");
        int n = s1.nextInt();

        int [] calories = new int[n];
        int total = 0;
        int max = 0;
        int maxIndex = -1;
        
        for(int i=0;i<n;i++){
            calories[i] = s1.nextInt();
            total+=calories[i];

            if(calories[i]>max){
                max = calories[i];
                maxIndex = i+1;
            }
        }
        int target = s1.nextInt();
        int belowTarget = 0;
        for(int i=0;i<n;i++){
            if(calories[i]<target){
                belowTarget++;
            }
        }
        double avg = (double)total/(double)n;
        double goal = ((double)(n-belowTarget)/n)*100;

        System.out.println("Days Tracked: "+n);
        System.out.println("Total calories Burned: "+total);
        System.out.printf("Average Daily Burn: %.2f\n",avg);
        System.out.printf("Peak Burn Day: Day %d (%d calories)\n",maxIndex,max);
        System.out.println("Days Below Target: "+belowTarget);
        System.out.printf("Goal Achievement: %.2f%%",goal);
    }
}
