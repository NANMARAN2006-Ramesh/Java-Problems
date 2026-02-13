import java.util.Scanner;;
public class GroceryStoreSales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Total sales amount: ");
        int amt = scan.nextInt();
        System.out.print("Enter the Discount Percentage: ");
        int per = scan.nextInt();
        System.out.print("Enter the Tax Percentage: ");
        int tax = scan.nextInt();

        float dper = (amt*per)/100;
        float total = amt-dper;
        float taxper = (total*tax)/100;

        float bill = total + taxper;
        System.out.println("Final Revenue = "+bill);
    }

}
