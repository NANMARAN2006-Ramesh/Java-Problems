import java.util.Scanner;

public class AtemWithdrawalValidator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the Balance: ");
        int balance = s1.nextInt();
        int withdrawal;
        do{
            System.out.println("Enter the Withdrawal Amount: ");
            withdrawal = s1.nextInt();
            if(withdrawal<=0){
                System.out.println("Invalid amount! Try again.");
            }
            else if(withdrawal>balance){
                System.out.println("Insufficient funds! Try again.");
            }
            else{
                balance-=withdrawal;
                System.out.println("Withdrawal Successful! Remaining balance: "+balance);
            }
        }while(withdrawal>0 || withdrawal<=balance);
        s1.close();
    }
}
