import java.util.Scanner;

public class HealthcareInsurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scan.nextInt();
        System.out.println("Enter the smoking status");
        scan.nextLine();
        String smokingStatus = scan.nextLine();
        System.out.println("Enter the preExisting conditions");
        scan.nextLine();
        String preExisting = scan.nextLine();
        System.out.println("Enter the coverage tier");
        scan.nextLine();
        String coverageTier = scan.nextLine();
        
    }
}
