import java.util.Scanner;

public class CorporateTaxBracetCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the annual income");
        double annualIncome = scan.nextDouble();
        System.out.println("Enter the Business Type");
        scan.nextLine();
        String businessType = scan.nextLine();
        System.out.println("Enter the deuctibleExpenses");
        double deuctibleExpenses = scan.nextDouble();
        System.out.println("Enter the taxCredits");
        double taxCredits = scan.nextDouble();

        double taxableIncome = annualIncome-deuctibleExpenses;
        double taxRate = 0.0;
        if(businessType.equals("C-Corp")){
            if(taxableIncome<500000){
                taxRate = 21;
            }
            else if(taxableIncome>=500000 && taxableIncome<1000000){
                taxRate = 24;
            }
            else if(taxableIncome>=1000000 && taxableIncome<2000000){
                taxRate = 28;
            }
            else if(taxableIncome>=2000000){
                taxRate = 28;
            }
        }
        if(businessType.equals("S-Corp")){
            if(taxableIncome<500000){
                taxRate = 20;
            }
            else if(taxableIncome>=500000 && taxableIncome<1000000){
                taxRate = 25;
            }
            else if(taxableIncome>=1000000){
                taxRate = 28;
            }
        }
        if(businessType.equals("LLC")){
            if(taxableIncome<200000){
                taxRate = 15;
            }
            else if(taxableIncome>=200000 && taxableIncome<5000000){
                taxRate = 18;
            }
            else if(taxableIncome>=500000){
                taxRate = 22;
            }
        }
        if(businessType.equals("Partnership")){
            if(taxableIncome<300000){
                taxRate = 18;
            }
            else if(taxableIncome>=300000 && taxableIncome<8000000){
                taxRate = 22;
            }
            else if(taxableIncome>=800000){
                taxRate = 26;
            }
        }

        double grossTax = taxableIncome*(taxRate/100);
        double netTax = grossTax-taxCredits;
        double effectiveRate =(netTax/annualIncome)*100;
        
        System.out.println("Annual Revenue: $"+annualIncome);
        System.out.println("Business Type: "+businessType);
        System.out.println("Deductible Expenses: $"+deuctibleExpenses);
        System.out.println("Tax Cresits: $"+taxCredits);
        System.out.println("Taxable Income: $"+taxableIncome);
        System.out.println("Tax Rate: "+(int)taxRate+"%");
        System.out.println("Gross Tax: $"+grossTax);
        System.out.println("Net Tax After Credits: $"+netTax);
        System.out.println("Effective Tax Rate: $"+effectiveRate+"%");
        scan.close();
    }
}
