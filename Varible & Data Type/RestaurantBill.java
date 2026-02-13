import java.util.Scanner;
public class RestaurantBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Total Bill: ");
        int tb = scan.nextInt();
        System.out.print("Enter the Service Charge: ");
        int sc = scan.nextInt();
        System.out.print("Enter the Gst Percentage: ");
        int gst = scan.nextInt();
        System.out.print("Enter the person: ");
        int person = scan.nextInt();

        float add = ((tb*sc)/100)+((tb*gst)/100);
        float total = tb+add;
        float bill = total/person;

        System.out.println("Amount Per Person = "+bill);

    }
}
