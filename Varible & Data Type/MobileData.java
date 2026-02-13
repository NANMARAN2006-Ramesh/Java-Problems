import java.util.Scanner;;
public class MobileData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Base cost : ");
        int bc = scan.nextInt();
        System.out.print("Enter the Extra GB : ");
        int egb = scan.nextInt();
        System.out.print("Enter the Rate per GB : ");
        int rate = scan.nextInt();
        System.out.print("Enter the Tax Percentage: ");
        float tax = scan.nextFloat();

        float total = bc+(egb*rate);
        float per = (total*tax)/100;

        float result = total+per;
        System.out.println("Total Bill = "+result);
    }
}
