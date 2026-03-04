import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the digit");
        int digit = s1.nextInt();
        int temp = digit;

        int rev = 0;
        while (temp!=0) {
            int rem = temp%10;
            rev = rev*10+rem;
            temp/=10;
        }
        if(rev==digit){
            System.out.println(digit+" is a palindrome");
        }
        else{
            System.out.println(digit+" is not a palindrome");
        }
        s1.close();
    }
}
