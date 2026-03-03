import java.util.Scanner;

public class GcdCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the two number");
        int a = s1.nextInt();
        int b = s1.nextInt();

        int temp;
        while(b!=0){
            temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("The gcd: "+a);
        s1.close();
    }
}
