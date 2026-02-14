import java.util.*;
public class OnlineExamPassEvulation{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Theory marks");
        int theory = s1.nextInt();
        System.out.println("Entetr the practical Marks");
        int practical = s1.nextInt();
        int avg = (theory+practical)/2;
        if(theory>=50 && avg>=60 && practical>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("fail");
        }
        s1.close();
    }
}