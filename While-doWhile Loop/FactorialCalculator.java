import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int fact = 1;
        System.out.println("Enter the numbers");
        int num = s1.nextInt();

        int i = 1;
        while(i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of "+num+" = "+fact);
        s1.close();
    }
}
