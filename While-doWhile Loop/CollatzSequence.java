import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n = s1.nextInt();
        int originalN = n;
        int steps = 0;

        System.out.println("Collatz sequence starting from " + originalN + ":"); 
        if (n == 1) {
            System.out.println(1);
            System.out.println("Steps: 0");
        } else {
            do {
                System.out.print(n + " ");
                if (n % 2 == 0) {
                    n = n / 2;
                } 
                else {
                    n = (3 * n) + 1;
                }
                steps++;
            } while (n != 1);

            System.out.println(1);
            System.out.println("Steps: " + steps);
        }
        
        s1.close();
    }
}
