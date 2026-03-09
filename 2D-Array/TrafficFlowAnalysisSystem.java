import java.util.Scanner;

public class TrafficFlowAnalysisSystem {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int lanes = s1.nextInt();
        int hours = s1.nextInt();

        int[][] traffic = new int[lanes][hours];

        for (int i = 0; i < lanes; i++) {
            for (int j = 0; j < hours; j++) {
                traffic[i][j] = s1.nextInt();
            }
        }

        System.out.println("Traffic Data:");
        for (int i = 0; i < lanes; i++) {
            for (int j = 0; j < hours; j++) {
                System.out.print(traffic[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Total Traffic Per Lane:");
        for (int i = 0; i < lanes; i++) {
            int sum = 0;
            for (int j = 0; j < hours; j++) {
                sum += traffic[i][j];
            }
            System.out.println("Lane " + (i + 1) + ": " + sum);
        }

        int maxHourTraffic = 0;
        int busiestHour = 0;
        for (int j = 0; j < hours; j++) {
            int hourSum = 0;
            for (int i = 0; i < lanes; i++) {
                hourSum += traffic[i][j];
            }
            if (hourSum > maxHourTraffic) {
                maxHourTraffic = hourSum;
                busiestHour = j + 1;
            }
        }
        System.out.println();
        System.out.println("Busiest Hour: Hour " + busiestHour + " with " + maxHourTraffic + " vehicles");
        s1.close();
    }
}