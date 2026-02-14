import java.util.*;
public class E_CommerceFree{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the shipping cost");
        int cartValue = s.nextInt();
        System.out.println("Enter the premium Member or Not only 1 or 0");
        int premium = s.nextInt();

        if(cartValue>999 || premium==1){
            System.out.println("Free Shipping");
        }
        else{
            System.out.println("Shipping charges applied");
        }
        s.close();
    }
}
