import java.util.Scanner;

public class CountDigitInNumber {
    public static int reverseNum(int n){
        int count = 0;
        while(n>0){
            int temp = n%10;
            n=n/10;
            count++;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s1.nextInt();

        int res = reverseNum(num);
        System.out.println("Total Digit Count In a NUmber : "+res);

        s1.close();
    }
}

