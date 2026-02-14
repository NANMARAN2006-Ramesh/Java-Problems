import java.util.*;
public class BankLoanAproval {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = s.nextInt();
        System.out.println("Enter the credit score");
        int creditScore = s.nextInt();

        if(salary>25000 && creditScore>700){
            System.out.println("Loan Approved");
        }
        else{
            System.out.println("Loan Rejected");
        }
        s.close();
    }
}
