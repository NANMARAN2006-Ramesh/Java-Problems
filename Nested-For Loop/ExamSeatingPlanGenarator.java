import java.util.Scanner;

public class ExamSeatingPlanGenarator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the row and cols 1 to 10 each");
        int row = s1.nextInt();
        int cols = s1.nextInt();
        System.out.println("Enter the total students");
        int totalStudent = s1.nextInt();

        int rowSize = row*cols;
        int studentnum = 1;
        for(int i=1;i<=row*2;i++){
            for(int j=1;j<=cols;j++){
                if((i+j)%2==0 && studentnum<=totalStudent){
                    System.out.print("S"+String.format("%03d",studentnum)+" ");
                    studentnum++;
                }
                else{
                    System.out.print("---- ");
                }
            }
            System.out.println();
        }
        int empty = rowSize-totalStudent;
        System.out.println("Total Seats: "+rowSize);
        System.out.println("Occupied Seats: "+totalStudent);
        System.out.println("Empty Seats: "+empty);
        
        s1.close();
    }
}
