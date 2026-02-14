import java.util.*;
public class EmployeeOvertimeBonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the working hours");
        int workingHour = s.nextInt();
        System.out.println("Enter the attendance percentage");
        int attendance = s.nextInt();

        if(workingHour>40 && attendance>90){
            System.out.println("Bonus Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
        s.close();
    }
}
