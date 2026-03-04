import java.util.Scanner;

public class LcmCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the two number");
        int a = s1.nextInt();
        int b = s1.nextInt();

        int temp1 = a;
        int temp2 = b;
        int temp;
        while(b!=0){
            temp = b;
            b = a%b;
            a = temp;
        }
        int lcm = (temp1*temp2)/a;
        System.out.println("The gcd: "+lcm);
        s1.close();
    }
}
