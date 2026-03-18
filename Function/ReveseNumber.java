import java.util.Scanner;

public class ReveseNumber {
    public static int reverseNum(int n){
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
        int res = reverseNum(num);
        System.out.println("Ther reverse of given number : "+res);

        s1.close();
    }
}
