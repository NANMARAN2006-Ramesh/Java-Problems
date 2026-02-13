import java.util.Scanner;
public class Salary{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Basic Pay : ");
        int bp = scan.nextInt();
        System.out.println("Enter the house rent allowance : ");
        int hra = scan.nextInt();
        System.out.println("Enter the Performance Bonus : ");
        int bonus = scan.nextInt();
        System.err.println("Enter the Tax : ");
        int tax = scan.nextInt();
        System.out.println("Enter the Provident Fund : ");
        int fund = scan.nextInt();

        int total = (bp+hra+bonus)-tax-fund;
        System.out.println("Take Home Salary = "+total);
    }
}