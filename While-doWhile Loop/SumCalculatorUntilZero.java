import java.util.Scanner;

public class SumCalculatorUntilZero {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int num = -1;

        while (num!=0) {
            System.out.println("Enter the number: ");
            num = s1.nextInt();
            count++;
            sum = sum+num;
        }
        System.out.println("Total Sum: "+sum);
        System.out.println("Count: "+(count-1));
        s1.close();
    }
}
