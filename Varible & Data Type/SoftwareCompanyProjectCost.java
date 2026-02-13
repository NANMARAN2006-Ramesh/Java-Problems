import java.util.*;;
public class SoftwareCompanyProjectCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the developer working hours:");
        int hours = scan.nextInt();
        System.out.println("Enter the Hourly Rate:");
        int rate = scan.nextInt();
        System.out.println("Entet the Design Cost:");
        int designCost = scan.nextInt();
        System.out.println("Enter the Testing Cost:");
        int testingCost = scan.nextInt();
        System.out.println("ENter the advanced pay:");
        int advance = scan.nextInt();

        int bill = (hours*rate)+designCost+testingCost-advance;
        System.out.println("Final Project Cost = "+bill);
    }
}
