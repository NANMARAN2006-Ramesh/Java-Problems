import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the base");
        int num = s1.nextInt();
        System.out.println("Enter the exponent");
        int expo =  s1.nextInt();
        int i = 1;
        int power = 1;
        while (i<=expo) {
            power*=num;
            i++;
        }
        System.out.println(num+" ^ "+expo+ " = "+power);
        s1.close();
    }
}
