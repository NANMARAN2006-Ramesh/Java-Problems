import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s1.nextInt();
        int originalNumber = number;
        int temp = number;
        int digits = 0;
        while(temp != 0){
            digits++;
            temp /= 10;
        }
        temp = number;
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            int power = 1;
            for(int i = 0; i < digits; i++){
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        if(sum == originalNumber){
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
        s1.close();
    }
}