import java.util.*;
public class CreditCardPurchase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the credit limit");
        int credit = s.nextInt();
        System.out.println("Enter the purchase amount");
        int purchase = s.nextInt();
        System.out.println("Enter the card Blocked number only 0 or 1");
        int card = s.nextInt();

        if(purchase<credit && card==0){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
        s.close();
    }
}
