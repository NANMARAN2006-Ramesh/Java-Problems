import java.util.Scanner;;
public class FactoryMachineProduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Road Per Hour Amout:");
        int roadPerHour = scan.nextInt();
        System.out.println("Enter the Hours Worked:");
        int hourWorked = scan.nextInt();
        System.out.println("Enter the Over Time Bonus:");
        int oBonus = scan.nextInt();
        System.out.println("Enter the Rejected Roads:");
        int rejectRoad = scan.nextInt();

        int bill = ((roadPerHour*hourWorked)+(oBonus))-rejectRoad;
        System.out.println("Usable Roads = "+bill);
    }
}
