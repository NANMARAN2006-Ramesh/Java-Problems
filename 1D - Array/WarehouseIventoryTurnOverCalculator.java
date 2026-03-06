import java.util.Scanner;

public class WarehouseIventoryTurnOverCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of products");
        int n = s1.nextInt();
        int [] units = new int[n];
        int total = 0;
        int max = 0;
        int maxIndex = -1;
        for(int i=0;i<n;i++){
            units[i] = s1.nextInt();
            total += units[i];
            if(units[i] > max){
                max = units[i];
                maxIndex = i + 1;
            }
        }

        double avg = total/(double)n;
        double threshold = avg * 0.5;
        int slowMoving = 0;
        int [] clearanceCandidates = new int[n];
        for(int i=0;i<n;i++){
            if(units[i] < threshold){
                clearanceCandidates[slowMoving] = i + 1;
                slowMoving++;
            }
        }
        System.out.println("Total Products: " + n);
        System.out.println("Total Units Sold: " + total);
        System.out.printf("Average Monthly Sales: %.2f\n", avg);
        System.out.printf("Best Seller: Product %d (%d units)\n", maxIndex, max);
        System.out.println("Slow-Moving Products: " + slowMoving);
        System.out.printf("Turnover Threshold: %.2f units\n", threshold);

        System.out.print("Clearance Candidates: [");
        for(int i=0;i<slowMoving;i++){
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(clearanceCandidates[i]);
        }
        System.out.println("]");
    }
}