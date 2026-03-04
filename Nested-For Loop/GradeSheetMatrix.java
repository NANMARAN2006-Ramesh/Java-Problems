import java.util.Scanner;
public class GradeSheetMatrix{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of students, 1 to 10");
        int students = s1.nextInt();
        System.out.println("Enter the number of subjets, 1 to 8");
        int subjets = s1.nextInt();

        String [] names = new String[students];
        int [][] marks = new int[students][subjets];

        for(int i=0;i<students;i++){
            s1.nextLine();
            names[i] = s1.next();
            for(int j=0;j<subjets;j++){
                marks[i][j] = s1.nextInt();
            }
        }
        System.out.println();
        System.out.println("Grade Sheet: ");
        System.out.print("Student ");
        for(int i=0;i<subjets;i++){
            System.out.print("sub"+(i+1)+" ");
        }
        System.out.println("Average");
        for(int i=0;i<students;i++){
            double avg = 0.0;
            System.out.print(names[i]+" ");
            for(int j=0;j<subjets;j++){
                avg = avg+marks[i][j];
                System.out.print(marks[i][j]+" ");
            }
            System.out.printf("%.2f",(avg/subjets));
            System.out.println();
        }
        s1.close();
    }
}