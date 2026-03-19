import java.util.Scanner;

public class MaximumOfThreeNumber {
    public static int maxOfThreeNum(int n, int n1, int n2){
        int res1 ;
        if(n>n1 && n>n2){
            res1 = n;
        }
        else if(n1>n2){
            res1 = n1;
        }
        else{
            res1 = n2;
        }

        return res1;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the three number");
        int n = s1.nextInt();
        int n1 = s1.nextInt();
        int n2 = s1.nextInt();

        int res = maxOfThreeNum(n,n1,n2);
        System.out.println("The maximum of three number is: "+res);

        s1.close();
    }
}
