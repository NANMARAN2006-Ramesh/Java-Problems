import java.util.Scanner;

public class StudentGrandeAnalysis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int n = scan.nextInt();

        int pass = 0;
        int fail = 0;
        int highest = 0;
        int total = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<=i;j++){
                System.out.println("Enter the student name");
                scan.nextLine();
                String name = scan.nextLine();
                System.out.println("Enter the student mark");
                int mark = scan.nextInt();

                String grade = "";
                if(mark>=85 && mark<=100){
                    grade = "A";
                }
                else if(mark>=70 && mark<=84){
                    grade = "B";
                }
                else if(mark>=60 && mark<=69){
                    grade = "C";
                }
                else if(mark>=50 && mark<=59){
                    grade = "D";
                }
                else{
                    grade = "F";
                }

                String status = "";
                if(mark>=60){
                    status = "Pass";
                    pass++;
                }
                else {
                    status = "Fail";
                    fail++;
                }
                if(mark>highest){
                    highest = mark;
                }
                total = total+mark; 

                System.out.println("Student: "+name);
                System.out.println("Score: "+mark);
                System.out.println("Letter Grade: "+grade);
                System.out.println("status: "+status);
                System.out.println("\n");
            }    
        }
        double avg = total/n;
        System.out.println("Total Student: "+n);
        System.out.println("Class Average: "+avg);
        System.out.println("Highest Score: "+highest);
        System.out.println("Student Passed: "+pass);
        System.out.println("Studen Failed: "+fail);
        
        scan.close();
    }
}
