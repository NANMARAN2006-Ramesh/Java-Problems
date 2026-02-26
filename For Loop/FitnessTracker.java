import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalDuration = 0;
        double totalCalories = 0;

        for (int i = 1; i <= n; i++) {
            String exercise = sc.next();
            int minutes = sc.nextInt();

            double calories = 0;
            String intensity = "";

            if (exercise.equalsIgnoreCase("Running")) {
                calories = minutes * 10;
                intensity = "High";
            } else if (exercise.equalsIgnoreCase("Swimming")) {
                calories = minutes * 12;
                intensity = "High";
            } else if (exercise.equalsIgnoreCase("Cycling")) {
                calories = minutes * 8;
                intensity = "Moderate";
            } else if (exercise.equalsIgnoreCase("Gym")) {
                calories = minutes * 7;
                intensity = "Moderate";
            } else if (exercise.equalsIgnoreCase("Walking")) {
                calories = minutes * 4;
                intensity = "Low";
            }

            totalDuration += minutes;
            totalCalories += calories;

            System.out.println(
                "Session " + i + ": " + exercise +
                " Duration: " + minutes + " minutes " +
                "Calories Burned: " + (int) calories +
                " Intensity: " + intensity
            );
        }

        double averageCalories = totalCalories / n;
        String fitnessLevel;

        if (totalCalories < 300) {
            fitnessLevel = "Beginner";
        } else if (totalCalories <= 1000) {
            fitnessLevel = "Intermediate";
        } else {
            fitnessLevel = "Advanced";
        }

        System.out.println("Total Workouts: " + n);
        System.out.println("Total Duration: " + totalDuration + " minutes");
        System.out.println("Total Calories Burned: " + (int) totalCalories);
        System.out.println("Average Calories per Session: " + averageCalories);
        System.out.println("Fitness Level: " + fitnessLevel);

        sc.close();
    }
}