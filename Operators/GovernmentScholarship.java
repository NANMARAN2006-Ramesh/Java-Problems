import java.util.*;
public class GovernmentScholarship {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the family income");
        int familyIncome = s.nextInt();
        System.out.println("Enter the student score");
        int score = s.nextInt();

        if(familyIncome<200000 && score>=75){
            System.out.println("Granted");
        }
        else{
            System.out.println("Not Granted");
        }
        s.close();
    }
}
