import java.util.Scanner;
public class HospitalPatientBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Room Charge Per Day:");
        int roomCharge = scan.nextInt();
        System.out.println("Enter the Days:");
        int days = scan.nextInt();
        System.out.println("Enter the Medicine Cost: ");
        int medicineCost = scan.nextInt();
        System.out.println("Enter the Lab Fees:");
        int labFees = scan.nextInt();
        System.out.println("Enter the Insurance coverage:");
        int insurnce = scan.nextInt();

        int bill = ((roomCharge*days)+(medicineCost+labFees))-insurnce;
        System.out.println("Payable Amount = "+bill);
    }
}
