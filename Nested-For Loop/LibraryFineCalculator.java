import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of books returned (1 to 50)");
        int N = sc.nextInt();

        double totalFines = 0.0;
        int overdueCount = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter the booktype");
            String bookType = sc.next();
            System.out.println("Enter the days left");
            int daysLate = sc.nextInt();
            double dailyFine = 0.0;
            double cap = 0.0;
            if (bookType.equals("Regular")) {
                dailyFine = 0.5;
                cap = 10.0;
            } else if (bookType.equals("Reference")) {
                dailyFine = 1.0;
                cap = 20.0;
            } else if (bookType.equals("Magazine")) {
                dailyFine = 0.25;
                cap = 5.0;
            }
            double calculatedFine = daysLate * dailyFine;
            double actualFine = calculatedFine;
            boolean capApplied = false;
            if (calculatedFine > cap) {
                actualFine = cap;
                capApplied = true;
            }
            if (daysLate > 0) {
                overdueCount++;
            }
            totalFines += actualFine;
            System.out.println("Book " + i + ": " + bookType);
            System.out.println("Days Late: " + daysLate);
            System.out.println("Daily Fine: $" + dailyFine);
            System.out.println("Calculated Fine: $" + calculatedFine);
            System.out.println("Actual Fine: $" + actualFine);
            System.out.println("Cap Applied: " + (capApplied ? "Yes" : "No"));
            System.out.println();
        }
        double averageFine = N > 0 ? totalFines / N : 0.0;
        System.out.println("Total Books: " + N);
        System.out.println("Total Fines Collected: $" + totalFines);
        System.out.println("Books Overdue: " + overdueCount);
        System.out.println("Average Fine: $" + Math.round(averageFine * 100.0) / 100.0);

        sc.close();
    }
}