import java.util.*;

public class ManufacturingProductionOutputTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of production");
        int n = sc.nextInt();
        int[] units = new int[n];

        for (int i = 0; i < n; i++) {
            units[i] = sc.nextInt();
        }

        int total = 0;
        int max = units[0];
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            total += units[i];

            if (units[i] > max) {
                max = units[i];
                maxIndex = i;
            }
        }

        double avg = (double) total / n;
        double threshold = avg * 0.9;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (units[i] < threshold) {
                list.add(i + 1);
            }
        }

        System.out.println("Production Lines: " + n);
        System.out.println("Total Output: " + total + " units");
        System.out.printf("Average Output: %.2f units/hour\n", avg);
        System.out.println("Top Producer: Line " + (maxIndex + 1) + " (" + max + " units)");
        System.out.println("Underperforming Lines: " + list.size());
        System.out.printf("Performance Threshold: %.2f units\n", threshold);
        System.out.println("Priority Lines: " + list);

        sc.close();
    }
}