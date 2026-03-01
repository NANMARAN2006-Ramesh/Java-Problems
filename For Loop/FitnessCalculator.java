import java.util.*;

public class FitnessCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int totalDuration = 0;
        int totalCalories = 0;
        
        for (int i = 1; i <= N; i++) {
            String exercise = sc.next();
            int minutes = sc.nextInt();
            
            int rate = 0;
            String intensity = "";
            
            if (exercise.equals("Running")) {
                rate = 10;
                intensity = "High";
            } else if (exercise.equals("Swimming")) {
                rate = 12;
                intensity = "High";
            } else if (exercise.equals("Cycling")) {
                rate = 8;
                intensity = "Moderate";
            } else if (exercise.equals("Gym")) {
                rate = 7;
                intensity = "Moderate";
            } else if (exercise.equals("Walking")) {
                rate = 4;
                intensity = "Low";
            }
            
            int calories = rate * minutes;
            totalDuration += minutes;
            totalCalories += calories;
            
            System.out.println("Session " + i + ": " + exercise + 
                    " Duration: " + minutes + 
                    " minutes Calories Burned: " + calories + 
                    " Intensity: " + intensity);
        }
        
        double average = (double) totalCalories / N;
        String level;
        
        if (totalCalories < 300)
            level = "Beginner";
        else if (totalCalories <= 1000)
            level = "Intermediate";
        else
            level = "Advanced";
        
        System.out.println("Total Workouts: " + N);
        System.out.println("Total Duration: " + totalDuration + " minutes");
        System.out.println("Total Calories Burned: " + totalCalories);
        System.out.printf("Average Calories per Session: %.2f\n", average);
        System.out.println("Fitness Level: " + level);

        sc.close();
    }
}