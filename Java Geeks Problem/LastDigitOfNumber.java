import java.util.*;

class LastDigitOfNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int rem = n%10;
        System.out.println(rem);
    }
}