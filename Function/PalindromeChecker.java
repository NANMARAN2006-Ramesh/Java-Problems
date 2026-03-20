import java.util.Scanner;

public class PalindromeChecker {
    public static int palindrome(int n){
        int rev=0;
        while(n>0){
            int temp = n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s1.nextInt();
        int temp = num;
        int res = palindrome(num);
        if(res==temp){
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
        s1.close();
    }
}
