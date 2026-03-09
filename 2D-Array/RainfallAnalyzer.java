import java.util.Scanner;

public class RainfallAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] rainfall = new double[4][7];
        double[] weeklyTotal = new double[4];
        double monthlyTotal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                rainfall[i][j] = sc.nextDouble();
            }
        }
        System.out.println();
        System.out.println("Rainfall Data:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print((int)(rainfall[i][j] * 10) + " ");
            }
            System.out.println();
        }

        double min = -1;
        int driestWeek = 1;
        System.out.println("\nWeekly Totals:");
        for (int i = 0; i < 4; i++) {
            weeklyTotal[i] = 0;
            for (int j = 0; j < 7; j++) {
                weeklyTotal[i] = weeklyTotal[i] + rainfall[i][j];
            }
            weeklyTotal[i] = weeklyTotal[i] * 10;
            monthlyTotal = monthlyTotal + weeklyTotal[i];
            System.out.println("Week " + (i + 1) + ": " + (int)weeklyTotal[i] + " mm");
            if (weeklyTotal[i] < min || min==-1) {
                min = weeklyTotal[i];
                driestWeek = i + 1;
            }
        }

        System.out.println("\nMonthly Total: " + (int)monthlyTotal + " mm");
        System.out.println("Driest Week: Week " + driestWeek + " (" + (int)min + " mm)");

        sc.close();
    }
}