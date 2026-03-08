import java.util.*;

public class VehicleFuelEfficienyMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vehicles");
        int n = sc.nextInt();
        double[] mpg = new double[n];
        System.out.println("Enter the fuel efficiency in mpg");
        for (int i = 0; i < n; i++) {
            mpg[i] = sc.nextDouble();
        }

        double sum = 0;
        double max = mpg[0];
        double min = mpg[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            sum += mpg[i];

            if (mpg[i] > max) {
                max = mpg[i];
                maxIndex = i;
            }

            if (mpg[i] < min) {
                min = mpg[i];
                minIndex = i;
            }
        }

        double average = sum / n;
        double threshold = average * 0.8;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (mpg[i] < threshold) {
                list.add(i + 1);
            }
        }

        System.out.println("Fleet Size: " + n);
        System.out.printf("Average Fuel Efficiency: %.2f MPG\n", average);
        System.out.printf("Most Efficient: %.2f MPG (Vehicle %d)\n", max, maxIndex + 1);
        System.out.printf("Least Efficient: %.2f MPG (Vehicle %d)\n", min, minIndex + 1);
        System.out.println("Underperforming Vehicles: " + list.size());
        System.out.printf("Efficiency Threshold: %.2f MPG\n", threshold);
        System.out.println("Maintenance Priority: " + list);
        sc.close();
    }
}