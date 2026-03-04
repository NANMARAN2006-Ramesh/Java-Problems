import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = s1.nextInt();
        int temp = number;
        int sum = 0;
        
        if(number>0){
            int i = 1;
            while(i<=number/2){
                if(number%i==0){
                    sum = sum+i;
                }
                i++;
            }
            if(sum==temp){
                System.out.println(number+" is a perfect number");
            }
            else{
                System.out.println(number+" is not a perfect number");
            }
        }
        else{
            System.out.println(number+" is not a perfect number");
        }
        s1.close();
    }
}
