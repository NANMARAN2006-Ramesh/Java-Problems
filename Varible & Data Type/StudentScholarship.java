import java.util.Scanner;
public class StudentScholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Tution fees: ");
        int tf = scan.nextInt();
        System.out.print("Enter the reduce Percentage: ");
        int per = scan.nextInt();
        System.out.print("Enter the Exam Fees: ");
        int ef = scan.nextInt();
        System.out.print("Enter the Library Fees: ");
        int lf = scan.nextInt();

        int reduce = (tf*per)/100;
        int total = tf-reduce;

        int bill = total+ef+lf;
        System.out.println("Final Payable Fee = "+bill);
    }
}
