import java.util.*;

public class SocialMediaEngagementRateAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of posts");
        int n = sc.nextInt();
        double[] rate = new double[n];

        for (int i = 0; i < n; i++) {
            rate[i] = sc.nextDouble();
        }

        double sum = 0;
        double max = rate[0];
        double min = rate[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            sum += rate[i];

            if (rate[i] > max) {
                max = rate[i];
                maxIndex = i;
            }

            if (rate[i] < min) {
                min = rate[i];
                minIndex = i;
            }
        }

        double avg = sum / n;
        double threshold = avg * 2.0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (rate[i] > threshold) {
                list.add(i + 1);
            }
        }

        System.out.println("Total Posts: " + n);
        System.out.printf("Average Engagement: %.2f%%\n", avg);
        System.out.printf("Peak Engagement: %.2f%% (Post %d)\n", max, maxIndex + 1);
        System.out.printf("Lowest Engagement: %.2f%% (Post %d)\n", min, minIndex + 1);
        System.out.println("Viral Posts (>200% avg): " + list.size());
        System.out.printf("Viral Threshold: %.2f%%\n", threshold);
        System.out.println("Top Performers: " + list);

        sc.close();
    }
}