import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = s1.nextInt();
        int i = 2;
        boolean isprime = true;
        while(i<number){
            if(number%i==0){
                isprime = false;
                break;
            }
            i++;
        }
        if(isprime){
            System.out.println(number+" is prime");
        }
        else{
            System.out.println(number+" is not prime");
        }
        s1.close();
    }
}
