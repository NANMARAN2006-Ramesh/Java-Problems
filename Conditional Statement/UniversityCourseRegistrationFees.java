import java.util.Scanner;

public class UniversityCourseRegistrationFees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the studentStatus");
        String studentStatus = scan.nextLine();
        System.out.println("Enter the creditHours 1 to 21");
        int creditHours = scan.nextInt();
        System.out.println("Enter the programType");
        scan.nextLine();
        String programType = scan.nextLine();
        System.out.println("Enter the residence");
        String residency = scan.nextLine();


        double baseTutionFeeProgram = 0.0;
        if(programType.equals("Undergraduate")){
            baseTutionFeeProgram = 350;
        }
        else if(programType.equals("Graduate")){
            baseTutionFeeProgram = 550;
        }
        else if(programType.equals("Professional")){
            baseTutionFeeProgram = 800;
        }

        double residencyMultiplier = 0.0;
        if(residency.equals("In-State")){
            residencyMultiplier = 1.0;
        }
        else if(residency.equals("Out-of-State")){
            residencyMultiplier = 2.5;
        }
        else if(residency.equals("International")){
            residencyMultiplier = 3.0;
        }

        double programStatusFee= 0.0;
        if(studentStatus.equals("Full-Time")){
            if(programType.equals("Undergraduate")){
                programStatusFee = 500;
            }
            else if(programType.equals("Graduate")){
                programStatusFee = 750;
            }
            else if(programType.equals("Professional")){
                programStatusFee = 1200;
            }
        }
        if(studentStatus.equals("Part-Time")){
            if(programType.equals("Undergraduate")){
                programStatusFee = 300;
            }
            else if(programType.equals("Graduate")){
                programStatusFee = 750;
            }
            else if(programType.equals("Professional")){
                programStatusFee = 900;
            }
        }
        int activityFee = 0;
        if(studentStatus.equals("Full-Time")){
            activityFee = 200;
        }
        else if(studentStatus.equals("Part-Time")){
            activityFee = 100;
        }

        double tutionFee = creditHours*baseTutionFeeProgram*residencyMultiplier;
        double totalFee = tutionFee+programStatusFee+activityFee;

        String category = "";
        if(residency.equals("In-State")){
            category = "Standard";
        }
        else if(residency.equals("Continuing-Education")){
            category = "Reduced";
        }
        else if(residency.equals("Out-of-State")|| residency.equals("International")){
            category = "Premium";
        }

        System.out.println("Student Status: "+studentStatus);
        System.out.println("Credit Hours: "+creditHours);
        System.out.println("Program Type: "+programType);
        System.out.println("Residency: "+residency);
        System.out.println("Base Tution Per Credit: $"+baseTutionFeeProgram);
        System.out.println("Residency Multiplier: "+residencyMultiplier+"x");
        System.out.println("Program Fee: $"+programStatusFee);
        System.out.println("Student Activity Fee: $"+activityFee);
        System.out.println("Total Registration Fee: $"+totalFee);
        System.out.println("Fee Category: "+category);
        scan.close();
    }
}
