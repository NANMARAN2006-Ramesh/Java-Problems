import java.util.Scanner;

public class StudentGradeCalculatiton {
    public static double calculateAvg (int m1, int m2, int m3){
        double avg = (m1+m2+m3)/3.0;
        return avg;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the student mark");
        int m1 = s1.nextInt();
        int m2 = s1.nextInt();
        int m3 = s1.nextInt();

        double result = calculateAvg(m1, m2, m3);
        System.out.printf("The student avg: %.2f",result);
        s1.close();
    }
}
