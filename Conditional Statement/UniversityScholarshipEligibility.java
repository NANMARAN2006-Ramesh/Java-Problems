import java.util.Scanner;

public class UniversityScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the gpa");
        double gpa = sc.nextDouble();
        System.out.println("Enter the annual income in dollers");
        double income = sc.nextDouble();
        System.out.println("Enter the extraCurricular score");
        double extraCurricular = sc.nextDouble();
        System.out.println("Enter the scholarship Type");
        sc.nextLine();
        String scholarship = sc.nextLine();
        
        System.out.println("Family Income: $"+income);
        System.out.println("Extracurricular Score: "+extraCurricular);
        System.out.println("Scholarship Type: "+scholarship);
        if(gpa>=3.0){
            System.out.println("Eligibility: Eligibile");
            if(scholarship.equals("Merit")){
                if(gpa>=3.8 && extraCurricular>=80){
                    System.out.println("Award Amount: $25000");
                    System.out.println("Award Category: Full");
                }
                else if(gpa>=3.5 && extraCurricular>=70){
                    System.out.println("Award Amount: $15000");
                    System.out.println("Award category: Partial");
                }
                else if(gpa>=3.0 && extraCurricular>=60){
                    System.out.println("Awart Amount: $8000");
                    System.out.println("Award category: Minimum");
                }
            }
            else if(scholarship.equals("Need-Based")){
                if(income<=30000 && gpa>=3.5){
                    System.out.println("Award Amount: $30000");
                    System.out.println("Award Category: Full");
                }
                else if(income<=50000 && gpa>=3.0){
                    System.out.println("Award Amount: $18000");
                    System.out.println("Award category: Partial");
                }
                else if(income<=70000 && gpa>=2.8){
                    System.out.println("Awart Amount: $10000");
                    System.out.println("Award category: Minimum");
                }               
            }
            else if(scholarship.equals("Sports")){
                if(gpa>=3.0 && extraCurricular>=85){
                    System.out.println("Award Amount: $22000");
                    System.out.println("Award Category: Full");
                }
                else if(gpa>=2.8 && extraCurricular>=75){
                    System.out.println("Award Amount: $20000");
                    System.out.println("Award category: Partial");
                }
                else if(gpa>=2.5 && extraCurricular>=65){
                    System.out.println("Awart Amount: $12000");
                    System.out.println("Award category: Minimum");
                }
            }
        }
        else{
            System.out.println("Eligibility: Not Eligibility");
            System.out.println("Award Amount: $0.0");
            System.out.println("Award Category: None");
        }
        sc.close();
    }
}
