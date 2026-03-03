import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the counter in number");
        int number = s1.nextInt();
        int first = 0;
        int second = 1;
        int i = 0;
        while(i<number){
            System.out.print(first+" ");
            int temp = first+second;
            first = second;
            second = temp;
            i++;
        }
        s1.close();
    }
}
