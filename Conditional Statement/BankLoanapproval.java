import java.util.Scanner;
public class BankLoanapproval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the credit score");
        int creditScore = scan.nextInt();
        System.out.println("Enter the annualIncome");
        double annualIncome = scan.nextDouble();
        System.out.println("Enter the debtTolncomeRatio");
        double debtTolncomeRatio = scan.nextDouble();
        System.out.println("Enter the loatType");
        scan.nextLine();
        String loanType = scan.nextLine();

        String status = "No";
        if(creditScore>=750){
            status = "Excellent";
        }
        else if(creditScore>=700 && creditScore<=749){
            status = "Good";
        }
        else if(creditScore>=650 && creditScore<=699){
            status = "Fair";
        }
        else if(creditScore<650){
            status = "Poor";
        }
        else if(creditScore<=580 || debtTolncomeRatio>50){
            System.out.println("Decision: Rejected");
            System.out.println("Maximum Loan Amount: $0.0");
        }
        String debt = "No";
        if(debtTolncomeRatio<=30){
            debt = "Low";
        }
        else if(debtTolncomeRatio>=31 && debtTolncomeRatio<=40){
            debt = "Moderate";
        }
        else if(debtTolncomeRatio>40){
            debt = "High";
        }
        System.out.println("Credit Score: "+creditScore);
        System.out.println("Annual Income: $"+annualIncome);
        System.out.println("Debt-to-Income: "+debtTolncomeRatio+"%");
        System.out.println("Loan Type: "+loanType);
        double maxAmount = 0;
        if (loanType.equals("Home")){
            if(debt.equals("Low") && status.equals("Excellent")){
                System.out.println("Decision : Approved");
                maxAmount = 4*annualIncome;
            }
            else if(debt.equals("Good") && status.equals("Good")){
                System.out.println("Decision : Needs Review");
                maxAmount = 3*annualIncome;
            }
        }
        if (loanType.equals("Personal")){
            if(debt.equals("Low") && status.equals("Excellent")){
                System.out.println("Decision : Approved");
                maxAmount = 1*annualIncome;
            }
            else if(debt.equals("Moderate") && status.equals("Fair")){
                System.out.println("Decision : Needs Review");
                maxAmount = 0.5*annualIncome;
            }
        }
        if (loanType.equals("Business")){
            if((debt.equals("Low") && status.equals("Excellent"))|| ((debt.equals("Moderate") && status.equals("Good")))){
                System.out.println("Decision : Approved");
                maxAmount = 3*annualIncome;
            }
        } 


        if(creditScore<=580 || debtTolncomeRatio>50){
            System.out.println("Decision: Rejected");
            System.out.println("Maximum Loan Amount: $0.0");
        }else{
            System.out.println("Maximum Loan Amount: $"+maxAmount);
        }
        
        scan.close();  
    }
}
