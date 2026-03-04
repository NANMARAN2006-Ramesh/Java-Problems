import java.util.Scanner;

public class StudentAttendanceMatrix {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the number of students, 1 to 10 : ");
        int students = s1.nextInt();
        System.out.println("Enter the number of days: ");
        int days = s1.nextInt();

        String [] names = new String[students];
        String [][] attendance = new String[students][days];
        double [] attendPercentage = new double[students];

        
        System.out.println("Enter the student name and student attendance");
        for(int i=0;i<students;i++){
            int attendanceCount = 0;
            names[i] = s1.next();
            for(int j=0;j<days;j++){
                attendance[i][j] = s1.next();
                if(attendance[i][j].equals("p")|| attendance[i][j].equals("P")){
                    attendanceCount++;
                }
            }
            attendPercentage[i] = (attendanceCount/(double)days)*100.0;
            System.out.println();
        }
        System.out.println("Attendance Matrix: ");
        System.out.print("Student: ");
        for(int i=1;i<=days;i++){
            System.out.print("Day"+i+" ");
        }
        System.out.print(" Attendace%");
        System.out.println();
        for(int i=0;i<students;i++){
            System.out.print(names[i]+" ");
            for(int j=0;j<days;j++){
                System.out.print(attendance[i][j]+" ");
            }
            System.out.printf("%.2f",attendPercentage[i],"%");
            System.out.println();
        }
        s1.close();
    }
}
