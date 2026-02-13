import java.util.*;
public class GymTrainerMonthSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Base Salary:");
        int bs = scan.nextInt();
        System.out.println("Enter the sessions:");
        int session = scan.nextInt();
        System.out.println("Enter the Per Pay session:");
        int persession = scan.nextInt();
        System.out.println("Enter the bonus:");
        int bonus = scan.nextInt();
        System.out.println("Enter the maintenance Fee:");
        int maintenance = scan.nextInt();

        int bill = bs+(session*persession)+bonus-maintenance;
        System.out.println("Final Salary = "+bill);
    }
}
