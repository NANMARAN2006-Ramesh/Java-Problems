import java.util.Scanner;

public class DigitSumCalculator{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the digit");
        int digit = s1.nextInt();
        int temp = digit;
        int sum = 0;
        while(digit>0){
            int rem = digit%10;
            sum = sum+rem;
            digit/=10;
        }
        System.out.println("Number: "+temp);
        System.out.println("Sum of digits: "+sum);
        s1.close();
    }
}