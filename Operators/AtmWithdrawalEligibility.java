import java.util.*;
public class AtmWithdrawalEligibility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account balance");
        int balance = s.nextInt();
        System.out.println("Enter the withdrawal amount");
        int withdrawal = s.nextInt();
        System.out.println("Enter the daily limit");
        int dailyLimit = s.nextInt();

        if(withdrawal<=balance && withdrawal<dailyLimit){
            System.out.println("Transaction Approved");
        }
        else{
            System.out.println("Transaction Declined");
        }
        s.close();
    }
}
