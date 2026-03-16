import java.util.Scanner;

public class FactorialFn{

    int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = s1.nextInt();

        FactorialFn obj = new FactorialFn();
        int result = obj.factorial(range);

        System.out.println("Factorial = "+result);
    }
}
