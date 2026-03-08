import java.util.*;

public class RealEstatePropertyValuationAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of peroperty ");
        int n = sc.nextInt();
        double[] val = new double[n];

        for (int i = 0; i < n; i++) {
            val[i] = sc.nextDouble();
        }

        double total = 0;
        double max = val[0];
        double min = val[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            total += val[i];

            if (val[i] > max) {
                max = val[i];
                maxIndex = i;
            }

            if (val[i] < min) {
                min = val[i];
                minIndex = i;
            }
        }

        double avg = total / n;
        double bargainThreshold = avg * 0.7;
        double premiumThreshold = avg * 1.5;

        int bargain = 0;
        int premium = 0;

        for (int i = 0; i < n; i++) {
            if (val[i] < bargainThreshold) {
                bargain++;
            }
            if (val[i] > premiumThreshold) {
                premium++;
            }
        }

        System.out.println("Total Properties: " + n);
        System.out.printf("Portfolio Value: $%.2f\n", total);
        System.out.printf("Average Property Value: $%.2f\n", avg);
        System.out.printf("Most Valuable: $%.2f (Property %d)\n", max, maxIndex + 1);
        System.out.printf("Least Valuable: $%.2f (Property %d)\n", min, minIndex + 1);
        System.out.println("Bargain Properties (<70% avg): " + bargain);
        System.out.println("Premium Properties (>150% avg): " + premium);
    }
}