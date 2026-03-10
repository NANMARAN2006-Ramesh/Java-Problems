import java.util.Scanner;

public class QuizScoreCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student (1 to 100)");
        int N = sc.nextInt();

        int passCount = 0;
        int failCount = 0;
        int highestScore = Integer.MIN_VALUE;
        int totalScore = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the correct answer");
            int correct = sc.nextInt();
            System.out.println("Enter the wrong answer");
            int wrong = sc.nextInt();
            System.out.println("Enter the unattempted");
            int unattempted = sc.nextInt();
            int score = (correct * 4) - (wrong * 3);
            String result;
            if (score >= 32) {
                result = "Pass";
                passCount++;
            } else {
                result = "Fail";
                failCount++;
            }
            highestScore = Math.max(highestScore, score);
            totalScore += score;
            System.out.println("Student: " + name);
            System.out.println("Correct: " + correct);
            System.out.println("Wrong: " + wrong);
            System.out.println("Unattempted: " + unattempted);
            System.out.println("Score: " + score);
            System.out.println("Result: " + result);
            System.out.println();
        }
        double average = (double) totalScore / N;
        System.out.println("Total Students: " + N);
        System.out.println("Pass Count: " + passCount);
        System.out.println("Fail Count: " + failCount);
        System.out.println("Class Average: " + average);
        System.out.println("Highest Score: " + highestScore);

        sc.close();
    }
}