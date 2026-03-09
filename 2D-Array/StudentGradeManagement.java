import java.util.Scanner;

public class StudentGradeManagement{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of students, 1to 100");
        int students = s1.nextInt();
        System.out.println("Enter the number of subjects, 1 to 10");
        int subjects = s1.nextInt();

        int[][] marks = new int[students][subjects];

        System.out.println("Enter the student marks");
        for(int i=0;i<students;i++){
            for(int j=0;j<subjects;j++){
                marks[i][j] = s1.nextInt();
            }
        }

        System.out.println("Student Average");
        for(int i=0;i<students;i++){
            int sum = 0;
            for(int j=0;j<subjects;j++){
                sum+=marks[i][j];
            }
            double avg = (double) sum /subjects;
            int result = (int) (avg*100);
            System.out.println("Student "+(i+1)+": "+result);
        }
        System.out.println();
        System.out.println("Subject Average: ");
        for (int j = 0; j < subjects; j++) {
            int sum = 0;
            for (int i = 0; i < students; i++) {
                sum += marks[i][j];
            }
            double avg = (double) sum / students;
            int result = (int) (avg * 100);
            System.out.println("Subject " + (j + 1) + ": " + result);
        }
        s1.close();
    }
}