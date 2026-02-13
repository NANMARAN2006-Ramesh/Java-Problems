import java.util.Scanner;
public class FinalWeeklyWage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Days Worked: ");
        int days = scan.nextInt();
        System.out.println("Enter the Wage Per Day: ");
        int wageAmount = scan.nextInt();
        System.out.println("Enter the Overtime Bonus: ");
        int oBonus = scan.nextInt();
        System.out.println("Enter the Maintenance Charge:");
        int maintenance = scan.nextInt();

        int amt = (days*wageAmount)+oBonus;
        int bill = amt-maintenance;

        System.out.println("Final Weekly Wage: "+bill);

    }
}
