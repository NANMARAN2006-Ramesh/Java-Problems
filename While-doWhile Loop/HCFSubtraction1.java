import java.util.Scanner;

public class HCFSubtraction1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp1 = a;
        int temp2 = b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } 
            else {
                b = b - a;
            }
        }
        System.out.println("HCF of " + temp1 + " and " + temp2 + " = " + a);
        sc.close();
    }
}