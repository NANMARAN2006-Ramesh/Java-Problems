import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = s1.nextInt();
        int temp = number;
        int rev = 0;
        while (number!=0) {
            int rem = number%10;
            rev = rev*10+rem;
            number/=10;
        }
        System.out.println("Original: "+temp);
        System.out.println("Reversed: "+rev);
        s1.close();
    }
}
