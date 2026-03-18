import java.util.Scanner;

public class PrimeChecker {
    public static boolean primeCheck(int n){
        boolean isPrime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s1.nextInt();

        boolean res = primeCheck(num);
        if(res){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("not a Prime Number");
        }
        s1.close();
    }
}
